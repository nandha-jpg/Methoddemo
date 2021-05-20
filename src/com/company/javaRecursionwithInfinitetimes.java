package com.company;

public class javaRecursionwithInfinitetimes {
    static void demorec(){
        System.out.println("Hello for 'n' times");
        demorec();
    }              // Recursion in java is a process in which a method calls itself continuously.
                  // A method in java that calls itself is called recursive method.
                 // It makes the code compact but complex to understand.


    public static void main(String[] args) {
        demorec();
    }
}
//This will throw java.lang.StackOverflowError