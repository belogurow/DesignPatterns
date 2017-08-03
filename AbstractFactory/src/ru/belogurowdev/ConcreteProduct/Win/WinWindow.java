package ru.belogurowdev.ConcreteProduct.Win;

import ru.belogurowdev.AbstractProduct.Window;

public class WinWindow implements Window {

    public WinWindow() {
        System.out.println("create \'Win\' Window");
    }

    @Override
    public void setBorderColor(String borderColor) {
        System.out.println("set \'Win\' window border color - " + borderColor);
    }

    @Override
    public void setBackgroundColor(String backgroundColor) {
        System.out.println("set \'Win\' window background color - " + backgroundColor);
    }
}
