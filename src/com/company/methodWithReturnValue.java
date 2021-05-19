package com.company;

public class methodWithReturnValue {
   //You can also store the result in a variable (recommended, as it is easier to read and maintain):
    static int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        int z=add(15,10) ;
        System.out.println("The value of z is "+z);

    }
}
