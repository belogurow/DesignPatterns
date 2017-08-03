package ru.belogurowdev.ConcreteFactory;

import ru.belogurowdev.AbstractProduct.Button;
import ru.belogurowdev.AbstractFactory.GUIFactory;
import ru.belogurowdev.ConcreteProduct.Win.WinButton;
import ru.belogurowdev.ConcreteProduct.Win.WinWindow;
import ru.belogurowdev.AbstractProduct.Window;

public class WinFactory implements GUIFactory {

    private static final String SYSTEM_NAME = "Win. ";

    @Override
    public Window createWindow() {
        return new WinWindow();
    }

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public void printSystemName() {
        System.out.println(SYSTEM_NAME);
    }
}
