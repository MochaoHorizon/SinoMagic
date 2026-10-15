package com.DHMR114514.DMHRsJavaLib.newfunction;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        int shichen = 0;    //100s
        int day = 1;    //20min
        int month = 1;    //10h
        int year = 1;    //5d
        int jieqi = 1;
        int season = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("开始");
        String run = scanner.next();
        if (run.equals("start")) {
            while (true) {
                if (shichen == 12) {    //天进位
                    day++;
                    shichen = 0;
                }
                if (day == 30) {    //月进位
                    month++;
                    day = 1;
                }
                if (year % 3 != 0) {    //年进位
                    if (month == 12) {    //不闰
                        year++;
                        month = 1;
                        season = 1;
                        jieqi = 1;
                    }
                } else {
                    if (month == 13) {    //三年一闰
                        year++;
                        month = 1;
                        season = 1;
                        jieqi = 1;
                    }
                }
                if (day == 15) {    //节气
                    jieqi++;
                }
                if (jieqi % 6 == 0) {    //季节
                    season++;
                }
                try {    //每100s执行一次
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                shichen++;
                System.out.println(year + "年" + season + "季" + month + "月" + day + "日" + shichen + "时");
            }
        }
    }
}