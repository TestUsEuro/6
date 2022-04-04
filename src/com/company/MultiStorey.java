package com.company;

public class MultiStorey extends House {

    private int floor;

    public MultiStorey(String colour, double height, double length, double width, int numberOfPeople, int floor) {
        super(colour, height, length, width, numberOfPeople);
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public double calculateSquare() {
        return getLength() * getWidth() * floor;
    }

    @Override
    public void getAllInfo() {
        System.out.println("Color : " + getColour() + ", people : " + getNumberOfPeople() + ", floor = " + getFloor());
    }
}
