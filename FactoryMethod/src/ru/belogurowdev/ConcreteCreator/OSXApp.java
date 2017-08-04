package ru.belogurowdev.ConcreteCreator;

import ru.belogurowdev.ConcreteProduct.OSXButton;
import ru.belogurowdev.Creator.Application;
import ru.belogurowdev.Product.Button;

public class OSXApp implements Application {
    @Override
    public Button createButton() {
        return new OSXButton();
    }
}
