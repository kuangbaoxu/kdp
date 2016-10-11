package com.bxkj.kdp.common;

import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class SessionListener implements HttpSessionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SessionListener.class);
    public static ConcurrentHashMap<String, DbUserDetails> userMap = new ConcurrentHashMap<String, DbUserDetails>();

    @Override
    public void sessionCreated(HttpSessionEvent se) {
      Object  objSession = se.getSession().getAttribute("userDetail");
        if(null != objSession) {
            DbUserDetails userDetail = (DbUserDetails)objSession;
            userMap.put(userDetail.getUserId(), userDetail);
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        try{
            Object  objSession = se.getSession().getAttribute("userDetail");
            if(null != objSession) {
                DbUserDetails userDetail = (DbUserDetails)objSession;
                userMap.remove(userDetail.getUserId());
            }
            // 销毁session
            se.getSession().removeAttribute("userDetail");
        }catch(Exception e){
            LOGGER.error("remove session error.", e);
        }
    }
}
