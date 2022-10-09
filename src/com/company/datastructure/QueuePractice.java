package com.company.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();

        queue.add(new Person("someone"));
        queue.add(new Person("another one"));
        queue.add(new Person("and another more"));

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

     }

     static class Person{
        private String name;

         public Person(String name) {
             this.name = name;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         @Override
         public String toString() {
             return "Person{" +
                     "name='" + name + '\'' +
                     '}';
         }
     }
}
