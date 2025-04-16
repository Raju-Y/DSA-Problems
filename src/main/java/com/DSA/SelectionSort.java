package com.DSA;

public class SelectionSort {

    public static void main(String[] args) {
        int [] num = {6,5,2,8,9,4};
        int size = num.length;
        int temp = 0;
        int minIndex = -1;

        for (int i=0; i<size-1; i++){

            minIndex =i;

            for (int j=i+1; j<size; j++){

                if (num[minIndex] > num[j])
                    minIndex = j;
            }

            temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;
        }

        for (int nums : num){
            System.out.print(nums + " ");
        }
    }
}
