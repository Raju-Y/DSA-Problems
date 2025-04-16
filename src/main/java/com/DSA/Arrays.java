package com.DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
       /* int [] num = {5,6,17,12,9};

        // getting value from index
        int index = num[2];
        System.out.println(index);*/

        // searching for value

        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(6);
        num.add(17);
        num.add(12);
        num.add(9);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value to search for: ");
        int target = scanner.nextInt();

        int index = num.indexOf(target);

        if (index != -1){
            System.out.println("Value " + target + " Index" + index);
        }else {
            System.out.println("Value Not Found :" + target);
        }
        System.out.println();
    }
}
