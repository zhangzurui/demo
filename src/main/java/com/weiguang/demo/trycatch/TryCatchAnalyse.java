package com.weiguang.demo.trycatch;

/**
 * @author zhangzurui
 * @date 2020/10/14 11:59
 */
public class TryCatchAnalyse {

    public static void main(String[] args){
        try{
            int count = 0;
            throw new Exception("new Exception");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
