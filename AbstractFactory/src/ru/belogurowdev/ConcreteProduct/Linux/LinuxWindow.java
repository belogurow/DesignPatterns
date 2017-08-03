package ru.belogurowdev.ConcreteProduct.Linux;

import ru.belogurowdev.AbstractProduct.Window;

public class LinuxWindow implements Window {

    public LinuxWindow() {
        System.out.println("create \'Linux\' Window");
    }

    @Override
    public void setBorderColor(String borderColor) {
        System.out.println("set \'Linux\' window border color - " + borderColor);
    }

    @Override
    public void setBackgroundColor(String backgroundColor) {
        System.out.println("set \'Linux\' window background color - " + backgroundColor);
    }

}
