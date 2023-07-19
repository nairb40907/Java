package com.House;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("此功能為兩數相除\n請輸入第一個數：");
        int num1 = sc.nextInt();
        System.out.print("請輸入第二個數：");
        int num2 = sc.nextInt();

        double value = (double)num1/num2;

        System.out.printf( num1 + " ÷ " + num2 + " = %.10f", value);

        sc.close();
    }
}
