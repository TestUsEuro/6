package com.company;

public class Cottage extends House {

    public Cottage(String colour, double height, double length, double width, int numberOfPeople) {
        super(colour, height, length, width, numberOfPeople);
    }

    @Override
    public double calculateSquare() {
        return getLength()*getWidth();
    }

    @Override
    public void getAllInfo() {
        System.out.println(super.toString());
    }
}
