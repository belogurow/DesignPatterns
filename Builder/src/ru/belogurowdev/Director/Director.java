package ru.belogurowdev.Director;

import ru.belogurowdev.Builder.Builder;
import ru.belogurowdev.OperatingSystem;

public class Director {
    public void constructIPhone7(Builder builder) {
        builder.setCompany("Apple");
        builder.setName("iPhone 7");
        builder.setOperatingSystem(OperatingSystem.iOS);
        builder.setScreenSize(4.7f);
        builder.isMiniJackEnabled(false);
    }

    public void constructGalaxyS7(Builder builder) {
        builder.setCompany("Samsung");
        builder.setName("Galaxy S7");
        builder.setOperatingSystem(OperatingSystem.Android);
        builder.setScreenSize(5.1f);
        builder.isMiniJackEnabled(true);
    }

    public void constructMiPad3(Builder builder) {
        builder.setCompany("Xiaomi");
        builder.setName("MiPad 3");
        builder.setOperatingSystem(OperatingSystem.Android);
        builder.setScreenSize(7.9f);
        builder.isMiniJackEnabled(true);
    }


}
