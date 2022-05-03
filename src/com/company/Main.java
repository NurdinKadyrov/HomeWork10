package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(trueFolse(a, 1, 2, 3, 4, 5, 6));
    }

    public static boolean trueFolse(int a, int... varargs) {
        for (int i = 0; i < varargs.length; i++) {
            if (a == varargs[i]) {
                System.out.println(varargs[i]);
                return true;
            }
        }
        return false;
    }
}