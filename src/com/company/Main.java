package com.company;

public class Main {

    public static void main(String[] args) {

        Cottage cottage = new Cottage("Blue", 5, 100, 120, 10);
        System.out.println("Square : " + cottage.calculateSquare());
        cottage.getAllInfo();

        MultiStorey multiStorey = new MultiStorey("White", 25, 120, 120, 100, 5);
        System.out.println("Square : " + multiStorey.calculateSquare());
        multiStorey.getAllInfo();


    }
}
