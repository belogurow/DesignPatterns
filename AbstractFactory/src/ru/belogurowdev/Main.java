package ru.belogurowdev;

import org.omg.CORBA.SystemException;
import ru.belogurowdev.OSX.OSXFactory;
import ru.belogurowdev.OSX.OSXWindow;
import ru.belogurowdev.Win.WinFactory;
import ru.belogurowdev.Win.WinWindow;

import java.io.Console;
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
            default:
                throw new Exception("???");
        }

        final Button button = factory.createButton();
        final Window window = factory.createWindow();
        button.onClick();
        window.setBorderColor("black");
    }

    private static String readSystemFromConsole() {
        String system = null;

        try {
            System.out.println("What are your system? Win or OSX?");
            Scanner scanner = new Scanner(System.in);
            system = scanner.nextLine();

            assert system != null;
            if (system.equals("OSX") || system.equals("Win")) {
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
