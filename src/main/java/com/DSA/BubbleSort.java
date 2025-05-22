package com.DSA;

public class BubbleSort {

    public static void main(String[] args) {

        int [] num = {6,5,2,8,9,4};
        int size = num.length;
        int temp = 0;

        for (int i=0; i<size; i++){
            for (int j=0; j<size-i-1; j++){
                if(num[j] > num[j+1]){

                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;

                }
            }
        }
        for (int nums : num){
            System.out.print(nums + " ");
        }

        System.out.println();
    }
}
