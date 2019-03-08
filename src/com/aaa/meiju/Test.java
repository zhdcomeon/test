package com.aaa.meiju;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
/*     Day day=Day.monday1;
     MyDay myDay= MyDay.monday1;
     MyDay[] myDays= myDay.values();
     for(MyDay my:myDays){
         System.out.println(my.name()+"---"+my.ordinal());
     }*/

        Scanner input =new Scanner(System.in);
        System.out.println("请输入星期几");
        String key=input.nextLine();
        MyDay myDay= MyDay.valueOf(key);
        switch (myDay){
            case monday1:
                System.out.println("星期一");
                break;
            case monday2:
                System.out.println("星期一");
                break;
            case monday3:
                System.out.println("星期一");
                break;
            case monday4:
                System.out.println("星期一");
                break;
            case monday5:
                System.out.println("星期一");
                break;
            case monday6:
                System.out.println("星期一");
                break;
            case monday7:
                System.out.println("星期一");
                break;
                default:
                    System.out.println("输入错误");
        }

    }
}
