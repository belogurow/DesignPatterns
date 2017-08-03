package ru.belogurowdev.Win;

import ru.belogurowdev.Button;
import ru.belogurowdev.GUIFactory;
import ru.belogurowdev.Window;

public class WinFactory implements GUIFactory {
    @Override
    public Window createWindow() {
        return new WinWindow();
    }

    @Override
    public Button createButton() {
        return new WinButton();
    }
}
