package ru.belogurowdev.ConcreteProduct.OSX;

import ru.belogurowdev.AbstractProduct.Window;

public class OSXWindow implements Window {

    public OSXWindow() {
        System.out.println("create \'OSX\' Window");
    }

    @Override
    public void setBorderColor(String borderColor) {
        System.out.println("set \'OSX\' window border color - " + borderColor);
    }

    @Override
    public void setBackgroundColor(String backgroundColor) {
        System.out.println("set \'OSX\' window background color - " + backgroundColor);
    }
}
