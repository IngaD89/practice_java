package com.company.handleexeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WorkingWithExeptions {
    public static void main(String[] args) {

        //checked exception

        try {
            FileInputStream inputStream = new FileInputStream("src/com/company/handleexeptions/example.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // unchecked exception

        try{
            double result = 10/0;
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("en unchecked error occurred");
        }finally {
            System.out.println("operation ended");
        }

        double result1 = division(2, 0);
        System.out.println(result1);
    }
        static double division(double x, double y){
            if(x == 0 || y == 0){
                throw new ProgramException("Cannot divide by 0");
            }
            return x/y;
        }



    static class ProgramException extends RuntimeException{
        public ProgramException(String message) {
            super(message);
            System.out.println(message);
        }
    }
}
