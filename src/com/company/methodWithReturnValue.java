package com.company;

public class methodWithReturnValue {
    //If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) ...
    //...instead of void, and use the return keyword inside the method
    static int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(add(15,10));
    }
}
