package ru.belogurowdev.Client;

import ru.belogurowdev.AbstractFactory.GUIFactory;
import ru.belogurowdev.AbstractProduct.Button;
import ru.belogurowdev.AbstractProduct.Window;
import ru.belogurowdev.ConcreteFactory.LinuxFactory;
import ru.belogurowdev.ConcreteFactory.OSXFactory;
import ru.belogurowdev.ConcreteFactory.WinFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        GUIFactory factory = null;

        final String system = readSystemFromConsole();

        assert system != null;
        switch (system) {
            case "OSX":
                factory = new OSXFactory();
                break;
            case "Win":
                factory = new WinFactory();
                break;
            case "Linux":
                factory = new LinuxFactory();
                break;
            default:
                throw new Exception("error");
        }

        final Button button = factory.createButton();
        button.onClick();

        final Window window = factory.createWindow();
        window.setBorderColor("black");
        window.setBackgroundColor("yellow");

        factory.printSystemName();

        /**
         * EXAMPLE
         *
         * What are your system? Win, OSX or Linux?
         * - OSX
         * create 'OSX' Button
         * clicked on 'OSX' Button
         * create 'OSX' Window
         * set 'OSX' window border color - black
         * set 'OSX' window background color - yellow
         * OSX.
         */
    }

    /**
     * Read name of system from console
     */
    private static String readSystemFromConsole() {
        String system;

        try {
            System.out.println("What are your system? Win, OSX or Linux?");
            Scanner scanner = new Scanner(System.in);
            system = scanner.nextLine();

            assert system != null;
            if (system.equals("OSX") || system.equals("Win") || system.equals("Linux")) {
                return system;
            } else {
                throw new Exception("System name error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
