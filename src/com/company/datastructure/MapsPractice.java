package com.company.datastructure;

import java.util.HashMap;
import java.util.Map;

public class MapsPractice {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Cat");
        map.put(2, "Dog");
        map.put(3, "Mouse");

        System.out.println(map);


        for(int key : map.keySet()){
            System.out.println(map.get(key));
        }

        map.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });
    }
}
