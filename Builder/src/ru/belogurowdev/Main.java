package ru.belogurowdev;

import ru.belogurowdev.ConcreteBuilder.PhoneBuilder;
import ru.belogurowdev.ConcreteBuilder.TabletBuilder;
import ru.belogurowdev.Director.Director;
import ru.belogurowdev.Product.Phone;
import ru.belogurowdev.Product.Tablet;

public class Main {

    public static void main(String[] args) {
        Director director= new Director();

        final PhoneBuilder phoneBuilder = new PhoneBuilder();

        // Construct iPhone7 with phoneBuilder
        director.constructIPhone7(phoneBuilder);
        final Phone iPhone7 = phoneBuilder.build();
        System.out.println(iPhone7);

        // Construct GalaxyS7 with phoneBuilder
        director.constructGalaxyS7(phoneBuilder);
        final Phone galaxyS7 = phoneBuilder.build();
        System.out.println(galaxyS7);

        // Construct MiPad 3 with tabletBuilder
        final TabletBuilder tabletBuilder = new TabletBuilder();

        director.constructMiPad3(tabletBuilder);
        final Tablet miPad3 = tabletBuilder.build();
        System.out.println(miPad3);

        /**
         * EXAMPLE
         *
         * Phone {
         *     model = 'Apple iPhone 7',
         *     operatingSystem = iOS,
         *     screenSize = '4.7'inch,
         *     isMiniJackEnabled = false
         * }
         * Phone {
         *     model = 'Samsung Galaxy S7',
         *     operatingSystem = Android,
         *     screenSize = '5.1'inch,
         *     isMiniJackEnabled = true
         * }
         * Tablet {
         *     model = 'Xiaomi MiPad 3',
         *     operatingSystem = Android,
         *     screenSize = '7.9'inch,
         *     isMiniJackEnabled = true
         * }
         */

    }
}
