package ru.belogurowdev;

import ru.belogurowdev.ConcreteCreator.OSXApp;
import ru.belogurowdev.ConcreteCreator.WinApp;
import ru.belogurowdev.Creator.Application;
import ru.belogurowdev.Product.Button;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<String> systems = new ArrayList<>();
        systems.add("OSX");
        systems.add("Win");

        // get random int from 0 to 1
        final String currentSystem = systems.get((int) Math.round(Math.random()));

        Application application = null;
        // create new app for current system
        switch (currentSystem) {
            case ("OSX"):
                application = new OSXApp();
                break;
            case ("Win"):
                application = new WinApp();
                break;
            default:
                throw new Exception("switch error");
        }

        // create okButton
        final Button okButton = application.createButton();
        okButton.setTittle("Ok");
        okButton.setBackgroundColor("green");
        okButton.onClick();

        System.out.println(okButton);

        /**
         * EXAMPLE
         *
         * created OSX Button
         * clicked on OSX Button
         * OSXButton {
         *     tittle='Ok',
         *     backgroundColor='green'
         * }
         */
    }
}
