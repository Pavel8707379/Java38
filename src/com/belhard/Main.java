package com.belhard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int x = element(a);
        System.out.println(x);

    }
    private static int element(int a){
        ArrayList<String> number = new ArrayList<>(1000000);
        for (String n: number) {
            System.out.println(n);
        }
        return a;
    }
}
