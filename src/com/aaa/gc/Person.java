package com.aaa.gc;

/**
 * fileName:Person
 * description:
 * author:zhanghaodong
 * createTime:2019/3/4 10:55
 */
public class Person {
    public  Person(){

        System.out.println("对象被创建---");
    }

    public void finalize(){
        System.out.println("对象被回收---");
    }
}
