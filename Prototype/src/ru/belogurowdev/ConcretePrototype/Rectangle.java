package ru.belogurowdev.ConcretePrototype;


public class Rectangle implements Cloneable {
    private float width, height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("draw rect with width - " + width + " and height - " + height);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "width = " + width +
                ", height = " + height +
                '}';
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
