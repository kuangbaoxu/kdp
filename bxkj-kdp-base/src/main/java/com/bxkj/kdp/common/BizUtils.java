package com.bxkj.kdp.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.util.StringUtils;


public class BizUtils {

   
        
    protected BizUtils() {

    }

    public static boolean compareObjContent(Object source, Object target) {

        boolean compareResult = true;
        Class<?> srcClass = source.getClass();
        List<Field> fieldsList = null;       
        fieldsList = getObjFields(srcClass);
        if (null != fieldsList && !fieldsList.isEmpty()) {
            for (Field field : fieldsList) {
                String nameKey = field.getName();

                Object srcValue = getClassValue(source, nameKey);
                Object tarValue = getClassValue(target, nameKey);

                if (srcValue == null) {
                    srcValue = "";
                }

                if (tarValue == null) {
                    tarValue = "";
                }

                if (!srcValue.toString().equals(tarValue.toString())) {
                    compareResult = false;
                    break;
                }
            }
        }

        return compareResult;
    }

    private static List<Field> getObjFields(Class<?> clzss) {

        List<Field> fieldsList = new ArrayList<Field>();
        fieldsList.addAll(Arrays.asList(clzss.getDeclaredFields()));

        if (clzss.getSuperclass() != null) {
            fieldsList.addAll(getObjFields(clzss.getSuperclass()));
        }
        return fieldsList;
    }

    private static Object getClassValue(Object obj, String fieldName) {

        Object objValue = null;

        if (obj == null) {
            return null;
        }
        try {

            Method[] ms = obj.getClass().getMethods();
            for (int i = 0; i < ms.length; i++) {
                if (!ms[i].getName().startsWith("get")) {
                    continue;
                }

                if (ms[i].getName().toUpperCase().equals(fieldName.toUpperCase())
                        || ms[i].getName().substring(3).toUpperCase().equals(fieldName.toUpperCase())) {
                    if("java.util.Date".equals(ms[i].getReturnType().getName())) {
                        objValue = ms[i].invoke(obj, new Object[] {});
                        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
                        objValue = format.format(objValue);
                       
                    } else {
                        objValue = ms[i].invoke(obj, new Object[] {});
                    }
                   
                }
            }
        } catch (Exception e) {
            //logger.info("取方法出错！" + e.toString());          
        }
        return objValue;
    }

    
    public static String getSerialNumber(int sequence) {
        
        NumberFormat nf = NumberFormat.getInstance();
        //设置是否使用分组
        nf.setGroupingUsed(false);
        //设置最大整数位数
        nf.setMaximumIntegerDigits(5);
        //设置最小整数位数   
        nf.setMinimumIntegerDigits(5);
        //输出测试语句
        return nf.format(sequence);
    }
    
    
    public static String sendPostRequest(String requestUrl,String urlParameter) throws IOException {
        
        URL url = new URL(requestUrl);
        
        URLConnection urlConn = url.openConnection();
    
        urlConn.setDoInput (true);
       
        urlConn.setDoOutput (true);
   
        urlConn.setUseCaches (false);
                    
        OutputStreamWriter printout = new OutputStreamWriter(urlConn.getOutputStream(),"UTF-8");
   
        printout.write(urlParameter);
        printout.flush ();
        printout.close ();
     
        String resultStr = "";
       
        BufferedReader bReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream(), "UTF-8"));
        String line = null;
        while (null != (line = bReader.readLine())) {
            resultStr += line;
        }
        bReader.close();
        
        return resultStr;
    }
    
    public static String getLastDayOfLastMonth() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        Calendar calendar = Calendar.getInstance();  
        int month = calendar.get(Calendar.MONTH);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH,calendar.getActualMaximum(Calendar.DAY_OF_MONTH));        
        return formatter.format(calendar.getTime());
    }
    
    
    public static Date getDelayOfCurrentTime(int hour) {
       
        Date date = new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, hour);              
        return calendar.getTime();
    }
    
    public static String getFirstDayOfNextMonth() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        Calendar calendar = Calendar.getInstance();       
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)+1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return  formatter.format(calendar.getTime());
    }
    
    public static String getSystemDateString() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    
    public static String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    
    public static String getCurrentDay() {
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());     
        return formatter.format(calendar.getTime()); 
    }
    
    public static Date getNowDate() {
        return new Date(System.currentTimeMillis());
    }
    
    @SuppressWarnings("static-access")
    public static String getNextDays(int nextDay) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(calendar.DATE,nextDay);//把日期往后增加一天.整数往后推,负数往前移动   
        return formatter.format(calendar.getTime()); 
    }
    
   
    public static String dateFormatter(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);     
        return formatter.format(calendar.getTime()); 
    }
    
    
    public static String getLastDayOfLastYear() {
        Date currTime = new Date();
        //yyyy-MM-dd 00:00:00
        @SuppressWarnings("deprecation")
        int year = currTime.getYear()-1;//年
        return String.valueOf(year)+"-12-31 00:00:00";
    }
    
    public static String getFirstDayOfNextYear() {
        Date currTime = new Date();

        @SuppressWarnings("deprecation")
        int year = currTime.getYear()+1;//年
        return String.valueOf(year)+"-01-01 00:00:00";
    }
    
    
    public static Date stringToDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = formatter.parse(dateString);
        } catch (ParseException e) {
            date = new Date();           
        }  
        return date; 
    }
    
        
    /**
     * 
     * Map to Json
     * @param map
     * @return
     * @author: songhc
     */
    @SuppressWarnings("rawtypes")
    public static String mapToJsonStr(Map<String ,String > map){  
        String string = "{";  
        for (Iterator it = map.entrySet().iterator(); it.hasNext();) {  
            Entry e = (Entry) it.next();  
            string += "'" + e.getKey() + "':";  
            string += "'" + e.getValue() + "',";  
        }  
        string = string.substring(0, string.lastIndexOf(","));  
        string += "}";  
        return string;  
    } 
    
    
    /**
     * 
     * Map to Json
     * @param map
     * @return
     * @author: songhc
     */
   
    public static String listToString(List<String> list){  
        String string = "";  
        if(null == list || list.isEmpty()) {
            return string;
        } else {
            for(String str:list) {
                string += str+"###";
            }
        }
        return string;  
    } 
    
    /**
     * 
     * Map to String (包含Html换行)
     * @param map
     * @return
     * @author: songhc
     */
    @SuppressWarnings("rawtypes")
    public static String mapToStr(Map<String ,String > map){  
        String string = "";  
        for (Iterator it = map.entrySet().iterator(); it.hasNext();) {  
            Entry e = (Entry) it.next();  
            string += e.getKey();  
            string += e.getValue()+"/n";  
        }        
        return string;  
    } 
    
    /**
     * 
     * 返回已字符和数组拼接的字符串
     * @param array 
     * @param character
     * @return
     * @author: songhc
     */
    public static String arrayToString(String [] array, String character) {
        String returnStr = "";
        
        if(null == array || array.length == 0 || StringUtils.isEmpty(character)) {
            return returnStr;
        }
        for(String arr:array) {
            returnStr += arr+character;
        }
        
        returnStr = returnStr.substring(0, returnStr.length()-character.length());
        
        return returnStr;
        
    }
    
    public static String listToString(List<String> list,String character) {
        
        if(null == list || list.size() == 0 || StringUtils.isEmpty(character)) {
            return "";
        }
        String[] array = list.toArray(new String[0]); 
        
        return arrayToString(array,character);  
    }
    
    public static Calendar getDateForMMSS(String date) {
       DateFormat df=new SimpleDateFormat("HH:mm");
       Calendar calendar=Calendar.getInstance();
       try {
          calendar.setTime(df.parse(date));
       } catch (ParseException e) {           
           //logger.info("时间解析出错！" + e.toString());      
       }
       return calendar;
    }
    
    public static String getCurrentDateForMMSS() {
        DateFormat df=new SimpleDateFormat("HH:mm");
        Date date =new Date();
        String time=df.format(date);
        return time;
     }
    /**
     * 
     * 将字符串按照分隔符分割后进行排序并返回排序后的数组组成的字符串
     * @param arrayStr
     * @param delimiter
     * @return
     * @author: Administrator
     */
    public static String sortStringWithDelimiter(String arrayStr,String delimiter){
        if(StringUtils.isEmpty(arrayStr)||StringUtils.isEmpty(delimiter)){
            return arrayStr;
        }
        String []arr = arrayStr.split(delimiter);
        Arrays.sort(arr);
        return String.join(delimiter,arr); 
    }
    
    public static String convertDate2String(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateStr = "";
        try {
            dateStr = sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }
    
    public static Date convertString2Date(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date dateStr = null;
        try {
            dateStr = sdf.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }
}
