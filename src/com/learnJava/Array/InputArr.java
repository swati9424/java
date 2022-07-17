package com.learnJava.Array;

import java.util.Scanner;

public class InputArr {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];
//

//        System.out.println(arr[1]);

        for(int i =0; i< arr.length; i++){
            arr[i] = scn.nextInt();
            System.out.println(arr[i] + "");
        }
//        for (int i =0; i< arr.length; i++){
//            System.out.println(arr[i] + "");
//        }

    }
}
