package ru.belogurowdev.ConcreteProduct.OSX;

import ru.belogurowdev.AbstractProduct.Button;

public class OSXButton implements Button {

    public OSXButton() {
        System.out.println("create \'OSX\' Button");
    }

    @Override
    public void onClick() {
        System.out.println("clicked on \'OSX\' Button");
    }
}
