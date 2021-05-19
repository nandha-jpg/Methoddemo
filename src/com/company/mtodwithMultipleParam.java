package com.company;

public class mtodwithMultipleParam {
    static void info(String name, int age, String nationality){
        System.out.println(name +" is "+age +" and from "+nationality);
    }

    public static void main(String[] args) {
        info("Nandha",15,"India");
        info("Siva",25,"America");
        info("George fedrik",43,"canada");
    }

}
