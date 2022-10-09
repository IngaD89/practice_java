package com.company.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsPractice {
    public static void main(String[] args) {
        Set<Character> caractersSet = new HashSet<>();
        caractersSet.add('A');
        caractersSet.add('B');
        caractersSet.add('C');

        Iterator<Character> iterator = caractersSet.iterator();
        while (iterator.hasNext()){
           Character character = iterator.next();
            System.out.println(character);
        }

//        for(char caracter : caractersSet){
//            System.out.println(caracter);
//        }
    }
}
