package ru.belogurowdev.ConcreteFactory;

import ru.belogurowdev.AbstractProduct.Button;
import ru.belogurowdev.AbstractFactory.GUIFactory;
import ru.belogurowdev.ConcreteProduct.OSX.OSXButton;
import ru.belogurowdev.ConcreteProduct.OSX.OSXWindow;
import ru.belogurowdev.AbstractProduct.Window;

public class OSXFactory implements GUIFactory {

    private static final String SYSTEM_NAME = "OSX. ";

    @Override
    public Window createWindow() {
        return new OSXWindow();
    }

    @Override
    public Button createButton() {
        return new OSXButton();
    }

    @Override
    public void printSystemName() {
        System.out.println(SYSTEM_NAME);
    }
}
