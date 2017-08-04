package ru.belogurowdev.ConcreteCreator;

import ru.belogurowdev.ConcreteProduct.WinButton;
import ru.belogurowdev.Creator.Application;
import ru.belogurowdev.Product.Button;

public class WinApp implements Application {

    @Override
    public Button createButton() {
        return new WinButton();
    }
}
