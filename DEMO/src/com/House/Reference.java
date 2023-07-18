package com.House;

public class Reference {
    public static void main(String[] args){
        int m = 5;
        int n = 6;

        System.out.println("M=" + m + " N=" + n);
        swap(m, n);/*分配原始變量時，會復制值。如果分配引用，則只會復制對象的地址（電話號碼）。不會復制對象本身。
        引用為您提供了另一個好處：您可以將對象引用傳遞給任何方法，並且該方法將能夠使用該引用通過調用其方法和訪問對象內部的數據來修改（更改）對象。*/
        System.out.println("M=" + m + " N=" + n);
    }

    private static void swap(int a, int b){
        int c = a;
        a = b;
        b = c;
    }
}
