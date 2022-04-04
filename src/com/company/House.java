package com.company;

public abstract class House {

    private String colour;
    private double height;
    private double length;
    private double width;
    private int numberOfPeople;

    public House(String colour, double height, double length, double width, int numberOfPeople) {
        this.colour = colour;
        this.height = height;
        this.length = length;
        this.width = width;
        this.numberOfPeople = numberOfPeople;
    }

    public abstract double calculateSquare();

    public abstract void getAllInfo();

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "House{" +
                "colour='" + colour + '\'' +
                ", height=" + height +
                ", length=" + length +
                ", width=" + width +
                ", numberOfPeople=" + numberOfPeople +
                '}';
    }
}
