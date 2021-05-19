package com.company;

public class mtdwithIfElse {
    static void ageM(int age){
        if(age<=18){
            System.out.println("Access denied. You are not matured enough!");
        }else {
            System.out.println("Access granted! Welcome!");
        }

    }

    public static void main(String[] args) {
        ageM(19);
    }
}
