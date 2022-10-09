package com.company.datastructure;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] numbers = {1, 20, 500, 4};
        numbers[3] = 5;

        System.out.println(numbers[1]);
        System.out.println(Arrays.toString(numbers));

        for(int number:numbers){
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
