package ru.belogurowdev.ConcreteProduct.Linux;

import ru.belogurowdev.AbstractProduct.Button;

public class LinuxButton implements Button {

    public LinuxButton() {
        System.out.println("create \'Linux\' Button");
    }

    @Override
    public void onClick() {
        System.out.println("clicked on \'Linux\' Button");
    }

}
