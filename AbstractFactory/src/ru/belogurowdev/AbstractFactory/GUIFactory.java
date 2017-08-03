package ru.belogurowdev.AbstractFactory;

import ru.belogurowdev.AbstractProduct.Button;
import ru.belogurowdev.AbstractProduct.Window;

public interface GUIFactory {
    Window createWindow();
    Button createButton();

    void printSystemName();
}
