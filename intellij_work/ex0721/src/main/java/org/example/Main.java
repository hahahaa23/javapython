package org.example;

public class Main {

    public static void showData(Object obj){
        System.out.println(obj);
        System.out.println(obj.toString());
    }
    public static void main(String[] args) {

        Integer iInst1 = Integer.valueOf(3);
        Integer iInst2 = 5;

        showData(iInst1);
        showData(iInst2);
        showData(Integer.valueOf(100));


    }
}