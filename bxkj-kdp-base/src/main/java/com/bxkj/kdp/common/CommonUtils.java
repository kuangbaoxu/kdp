package com.bxkj.kdp.common;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.sourceforge.pinyin4j.PinyinHelper;

import org.springframework.security.core.context.SecurityContextHolder;

public final class CommonUtils {
	
	
    public static String digest(String algorithm, String str) {
        return digest(algorithm, str.getBytes());
    }

    public static String digest(String algorithm, byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(bytes);
            return hex(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
            'e', 'f' };

    protected static String hex(byte[] bytes) {
        int len = bytes.length;
        StringBuilder sb = new StringBuilder(len * 2);

        for (int j = 0; j < len; j++) {
            sb.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
            sb.append(HEX_DIGITS[bytes[j] & 0x0f]);
        }
        return sb.toString();
    }
    // 获取当前登录用户的信息
    public static DbUserDetails getCurrentUser() {
    	// 获取当前登录用户的信息
    	DbUserDetails userDetails = (DbUserDetails) SecurityContextHolder.getContext()
    		    .getAuthentication()
    		    .getPrincipal();
		return userDetails;
    }
    
    /**
     * 获取拼音字母
     * @param str
     * @return
     */
    public static String getPinYinChar(String str) {
        String convert = "";
        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            String[] pinYinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if (pinYinArray != null) {
            	for (int j = 0; j < pinYinArray[0].length() - 1; j ++) {
            		convert += pinYinArray[0].charAt(j);
            	}
            } else {
                convert += word;
            }
        }
        return convert;
    }
    
    public static String dateToString(Date date, String formate) {
    	SimpleDateFormat dateFormat = new SimpleDateFormat(formate);
    	String str = dateFormat.format(date);
		return str;  
    }
    
}
