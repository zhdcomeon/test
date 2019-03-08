package com.aaa.maopao;

public class test {
  /*
  * 冒泡排序
  *
  * */

    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 2, 9, 1};
        System.out.println("排序前的数组为：");
        for (int num:arr){
            System.out.println(num+"");
        }
        for (int i = 0; i <arr.length ; i++) {  //循环控制外层排序次数
            //内层控制每一趟排序多少次之前的位数进行排序过 不用再进行无用的循环
            for (int j = 0; j <arr.length-1-i ; j++) {
              /*如果前面的大，则交换位置，把小的放前面，直到找出最小的放在最前面*/
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }

            }

        }
               System.out.println();
               System.out.println("排序后的数组为：");
                 for(int num:arr){
               System.out.print(num+" ");
                     }

    }
}
