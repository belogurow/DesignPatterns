package ru.belogurowdev.Win;

import ru.belogurowdev.Button;

public class WinButton implements Button {

    public WinButton() {
        System.out.println("create Win Button");
    }

    @Override
    public void onClick() {
        System.out.println("clicked on Win Button");
    }
}
