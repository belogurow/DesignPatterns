package ru.belogurowdev.OSX;

import ru.belogurowdev.Button;
import ru.belogurowdev.GUIFactory;
import ru.belogurowdev.Window;

public class OSXFactory implements GUIFactory {
    @Override
    public Window createWindow() {
        return new OSXWindow();
    }

    @Override
    public Button createButton() {
        return new OSXButton();
    }
}
