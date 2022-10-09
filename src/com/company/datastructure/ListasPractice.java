package com.company.datastructure;

import java.util.ArrayList;

public class ListasPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        for(int number : numbers){
            System.out.println(number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        numbers.forEach(System.out::println);
    }
}
