package com.System;
import java.io.*;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) throws IOException //指定異常狀態處理
    {

        Scanner s=new Scanner(System.in);

        System.out.println("你好我是JP，請問你的名字是？");
        String name = s.next();
        System.out.println(name+"，很高興認識你，請問您今年幾歲？");
        int age = s.nextInt();
        System.out.println(age+"歲呀，可惜我不清處我幾歲 Q_Q");
        System.out.println("嗯...那你喜歡喝什麼飲料呢？");
        String drink = s.next();
        System.out.println(drink+"是嗎！我沒喝過，我馬上去嘗試一下，掰掰囉~");

        System.out.println("===== 系統提示 =====");
        System.out.println("JP(Java Program)已無回應，程式結束。");

        s.close();    // 程式結束前關閉Scanner物件是好習慣。
    }//end of main(String[])
}//end of class Test