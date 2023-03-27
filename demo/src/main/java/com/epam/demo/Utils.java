package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static void main(String[] args)
    {
        System.out.println( isAllPositiveNumbers(null));
    }
    public static boolean isAllPositiveNumbers(List<String> args) {
        if(args == null || args.size() == 0)
        {
            return false;
        } else {
            for(String arg : args){
                if (!StringUtils.isPositiveNumber(arg)){
                    return false;
                }
            }
            return true;
        }
    }
}