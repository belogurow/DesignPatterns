package ru.belogurowdev.OSX;

import ru.belogurowdev.Window;

public class OSXWindow implements Window {

    public OSXWindow() {
        System.out.println("create OSX Window");
    }

    @Override
    public void setBorderColor(String borderColor) {
        System.out.println("New border color - " + borderColor);
    }
}
