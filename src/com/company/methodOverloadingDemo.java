package com.company;

public class methodOverloadingDemo {
    //With method overloading, multiple methods can have the same name with different parameters:
    //Instead of defining two methods that should do the same thing, it is better to overload one.

    static int numbers(int a, int b, int c){
        return a+b+c;
    }

    static double numbers(double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {

        int a= numbers(5,10,15);
        double b=numbers(55,80,98);
        System.out.println("The int value is "+a);
        System.out.println("The double value is "+b);
    }
}
