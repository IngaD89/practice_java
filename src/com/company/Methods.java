package com.company;

import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
        int x = incrementValue(0);
        print(x);
        var now = getCurrentDate();
        System.out.println(now);
        var yesterday = getMinusDays(1);
        System.out.println(yesterday);


    }

    private static int incrementValue(int value){
        return value +1;
    }

    private static void print(int value){
        System.out.println(value);

    }

    private static LocalDate getCurrentDate(){
        return LocalDate.now();
    }

    private static LocalDate getMinusDays(int v){
        return LocalDate.now().minusDays(v);
    }
}
