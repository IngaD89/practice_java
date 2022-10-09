package com.company.dealingwithmoney;

import java.math.BigDecimal;

public class bigDecimalsPractice {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("0.02");
        BigDecimal number2 = new BigDecimal("0.03");
        BigDecimal result = number2.subtract(number1);

        System.out.println(result);
        System.out.println(number1.compareTo(number2));
    }
}
