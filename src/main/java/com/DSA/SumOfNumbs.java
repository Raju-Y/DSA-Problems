package com.DSA;

import java.util.Scanner;

public class SumOfNumbs {
  /*  public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter First Number : ");
        Scanner scn = new Scanner(System.in);
        num1 = scn.nextInt();
        System.out.println("Enter Second Number : ");
        num2 = scn.nextInt();
        System.out.println("Total Sum is : " + (num1/num2));
    }*/

    public static void main(String[] args) {
        int count;
        System.out.println("Enter count of numbers : ");
        Scanner scn = new Scanner(System.in);
        count = scn.nextInt();
        int num, prod=1;
        for (int i=0; i<count; i++){
            num = scn.nextInt();
             prod = prod*num;
        }
        System.out.println("Total of the sum is : " + prod);
    }
}
