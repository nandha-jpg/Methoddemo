package com.company;

public class recursionWithFinitetimes {
    static int count=0;
    public static void finiteRec(){
        if(count<5){
            count++;
            System.out.println("hello for finite number of times - "+count);
            finiteRec();
        }
    }

    public static void main(String[] args) {
        finiteRec();
    }
}
