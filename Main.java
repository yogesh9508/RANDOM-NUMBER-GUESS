package com.apnacollege;

import java.util.Arrays;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userno;
        int mynum = (int) (Math.random() * 100);
        do {
            System.out.println("guess my number (1-100):");
            userno = sc.nextInt();
            if (userno == mynum) {
                System.out.println("***** CORRECT NUMBER ******");
                break;
            }
            else if (userno > mynum) {
                System.out.println(" your no is too large");
            }
            else {
                System.out.println(" your no is too small");
            }

        } while (userno >= 0);
        System.out.println("my number was ");
        System.out.println(mynum);


    }
}