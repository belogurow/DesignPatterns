package ru.belogurowdev.Win;

import ru.belogurowdev.Window;

public class WinWindow implements Window {

    public WinWindow() {
        System.out.println("create Win Window");
    }

    @Override
    public void setBorderColor(String borderColor) {
        System.out.println("New border color - " + borderColor);
    }
}
