package com.company.nullandoptionals;

import java.util.Optional;

public class NullPointer {
    public static void main(String[] args) {
        String brand = null;

        String brandNull = Optional.ofNullable(brand)
                .orElse("Brand not found");
        System.out.println(brandNull);

//        try{
//            System.out.println(brand.toUpperCase());
//        }catch (NullPointerException e){
//            System.out.println("Brand not found");
//        }
//
//      if(brand != null){
//          System.out.println(brand);
//      }else{
//          System.out.println("Brand not found");
//      }
    }
}
