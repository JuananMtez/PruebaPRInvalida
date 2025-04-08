package com.example.demo;

public class UserHelper {

    public static void doStuff(String n, int a) {
        if (n != null && !n.equals("")) {
            if (a > 18) {
                System.out.println("Hello " + n + ", access granted.");
            } else {
                System.out.println("Nope.");
            }
        } else {
            System.out.println("no name");
        }
    }

    public static int getNum() {
        int x = 0;
        while (x < 10) {
            x = x + 2;
            if (x == 4) break;
        }
        return x;
    }

    public static void main(String[] args) {
        doStuff("Pepe", 19);
        int n = getNum();
        System.out.println("Number: " + n);
    }
}
