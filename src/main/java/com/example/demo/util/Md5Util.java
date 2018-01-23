package com.example.demo.util;

import java.security.MessageDigest;

/**
 * @author BlackWing
 * @date 2018-01-23
 */
public class Md5Util {
    /**
     * MD5加密
     * @param message 要进行MD5加密的字符串
     * @return 加密结果为32位字符串
     */
    public static String getMD5(String message) {
        MessageDigest messageDigest = null;
        StringBuffer md5StrBuff = new StringBuffer();
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(message.getBytes("UTF-8"));

            byte[] byteArray = messageDigest.digest();
            for (int i = 0; i < byteArray.length; i++) {
                if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
                {md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));}
                else
                {   md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));}
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        // 字母大写
        return md5StrBuff.toString().toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(getMD5("14812218"));
    }
}
