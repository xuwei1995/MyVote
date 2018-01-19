package com.example.demo.util;

import java.util.HashMap;
import java.util.Map;

public class Helper {
    private static Helper instance ;

    private Helper(){

    }

    public static Helper getInstance(){
        if (instance == null) {
            synchronized (Helper.class){
                if (instance == null) {
                    instance = new Helper() ;
                }
            }
        }
        return instance ;
    }
    /**
     *errorJResult
     *@Author xw
     *@Date 2017/12/14 18:06
     */
    public Map<String,Object> errorJsonResultMap(String code, String ... errorMsg)
    {
        Map<String,Object> map=new HashMap<>();
        map.put("code",code);
        map.put("status","error");
        if(errorMsg.length>0)
        {
            map.put("msg",errorMsg[0]);
        }else {
            map.put("msg","");
        }
        return  map;
    }
    /**
     *successMsg
     *@Author xw
     *@Date 2017/12/14 18:10
     */
    public Map<String,Object> successJsonResultMap(Object object,String ... successMsg)
    {
        Map<String,Object> map=new HashMap<>();
        map.put("code","");
        map.put("status","success");
        map.put("data",object);
        if(successMsg.length>0)
        {
            map.put("msg",successMsg[0]);
        }else {
            map.put("msg","");
        }
        return  map;
    }
}
