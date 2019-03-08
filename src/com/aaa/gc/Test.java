package com.aaa.gc;

import sun.rmi.runtime.Log;

/**
 * fileName:Test
 * description:
 * author:zhanghaodong
 * createTime:2019/3/4 10:55
 */
public class Test {
    public static void main(String[] args) {
    Person p =new Person();
    try {
        Thread.sleep(3000);
    }catch (Exception e){

    }
    p=null;
    System.gc();

    Runtime r=Runtime.getRuntime();
        long max=r.maxMemory();
        long total=r.totalMemory();
        long free =r.freeMemory();
        System.out.println(max);
        System.out.println(total);
        System.out.println(free);
        byte[] b  =new byte[100000000];
        System.out.println("==============");
        long max1=r.maxMemory();
        long total1=r.totalMemory();
        long free1 =r.freeMemory();
        System.out.println(max1);
        System.out.println(total1);
        System.out.println(free1);



    }
}
