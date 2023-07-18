package com.House;

public class House {

    public static void main(String[] args)
    {
    int money = 30000;
    int year = 5;
        System.out.println("我的名字是Brian。\n");
        for (int i = 0; i < year; i++){
            System.out.println("我同意第"+(i+1)+"年的工資是 $"+money*(i+1)+"/月。");
        }
        System.out.println("\n感謝您，我的老闆，您如此慷慨大方！");
    }
}
