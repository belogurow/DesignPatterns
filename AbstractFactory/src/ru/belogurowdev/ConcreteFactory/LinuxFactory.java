package ru.belogurowdev.ConcreteFactory;

import ru.belogurowdev.AbstractFactory.GUIFactory;
import ru.belogurowdev.AbstractProduct.Button;
import ru.belogurowdev.AbstractProduct.Window;
import ru.belogurowdev.ConcreteProduct.Linux.LinuxButton;
import ru.belogurowdev.ConcreteProduct.Linux.LinuxWindow;

public class LinuxFactory implements GUIFactory {

    private static final String SYSTEM_NAME = "Linux. ";
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public void printSystemName() {
        System.out.println(SYSTEM_NAME);
    }
}
