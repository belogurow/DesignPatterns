package ru.belogurowdev.ConcretePrototype;

public class Circle implements Cloneable {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("draw circle with radius - " + radius);
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius = " + radius +
                '}';
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
