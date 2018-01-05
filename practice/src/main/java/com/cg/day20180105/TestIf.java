/**
 * Copyright (C), 2017-2018
 *
 * @FileName: TestIf
 * @Author: root1
 * @Date: 18-1-5 下午3:22
 * @Description: 这是测试if语句的类
 * History:
 */
package com.cg.day20180105;


import java.util.Scanner;

public class TestIf {
    /**
     * 练习A：键盘录入一个成绩，判断并输出成绩的等级
     * 90-100 优
     * 80-89  良
     * 70-79  中
     * 60-69  及格
     * 0-59   不及格
     *
     * 练习B： 键盘录入x的值，计算出y的值并输出
     *  x>=3 y=2*x+1;
     *  -1<x<3  y=2*x;
     *  x<= -1 y=2*x-1;
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 练习A
         */
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个成绩(范围在1-100之内):");
//        int x = sc.nextInt();
//
//        if (x>= 90 && x<= 100){
//            System.out.println("优");
//        }else if (x>=80 && x<=89){
//            System.out.println("良");
//        }else if (x>=70 && x<=79){
//            System.out.println("中");
//        }else if (x>=60 && x<=69){
//            System.out.println("及格");
//        }else if(x>=0 && x<=59){
//            System.out.println("不及格");
//        }else {
//            System.out.println("成绩录入错误");
//        }


        /**
         * 练习B
         */
        System.out.println("请输入一个整数:");
        int x = sc.nextInt();
        int y;
        if (x >=3){
            y=2*x+1;
        }else if (x>-1 && x<3){
            y=2*x;
        }else {
            y=2*x-1;

        }
        System.out.println("y的值是:"+y);
    }
}
