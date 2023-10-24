package com.platzi.javatests.util;

public class StringUtil {
    public static String repeat(String str, int times){
        String result = "";
        if (times < 0){
            throw new IllegalArgumentException("negative times cannot use it");
        }
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }

//    public static void assertEquals(String actual, String expected){
//        if(!actual.equals(expected)){
//            throw new RuntimeException(actual + " in not equal to value expected");
//        }
//    }
}
