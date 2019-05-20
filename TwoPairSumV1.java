//package com.company;

import java.util.Arrays;

public class TwoPairSumV1 {
    public static int[] TwoNumberSum(int[] arr, int sumToBeFound) {
        int arrLen = arr.length;
        int[] resultArray;
        resultArray = new int[2];
        for (int i = 0; i < arrLen; i++) {
            int firstNumber = arr[i];
            for (int j = i + 1; j < arrLen; j++) {
                int secondNumber = arr[j];
                if ((arr[i] + arr[j]) == sumToBeFound) {
                    return firstNumber > secondNumber ? new int[]{secondNumber, firstNumber} : new int[]{firstNumber, secondNumber};
                }
            }
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int pairSumToBeSerched = 5;
        int[] arr = new int[]{4, 7, 3, 2, -1, -11};
        int[] result = TwoNumberSum(arr,pairSumToBeSerched);
        if (result.length > 0) {
            System.out.println("Pair found : " + result[0] + "," + result[1] + " in array " + Arrays.toString(arr));
        } else {
            System.out.println("desired pair sum " + pairSumToBeSerched + " not found in array " + Arrays.toString(arr));
        }
    }
}