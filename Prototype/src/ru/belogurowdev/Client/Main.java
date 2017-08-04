package ru.belogurowdev.Client;

import ru.belogurowdev.ConcretePrototype.Circle;


public class Main {

    /**
     * This example uses built-in 'Cloneable' interface
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // create circleOne with radius 25
        final Circle circleOne = new Circle(25);
        // copy circleOne to circleTwo
        final Circle circleTwo = circleOne.clone();

        System.out.println(circleOne + "\n" + circleTwo + "\n");

        // circleOne change the radius to 10
        circleOne.setRadius(10);
        System.out.println(circleOne + "\n" + circleTwo);

        /**
         * EXAMPLE
         *
         * Circle {radius = 25.0}
         * Circle {radius = 25.0}
         *
         * Circle {radius = 10.0}
         * Circle {radius = 25.0}
         */


        /**
         * similarly with Rectangle
         */

    }
}
