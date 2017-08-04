package ru.belogurowdev;

import ru.belogurowdev.Singleton.DataBase;

public class Main {

    public static void main(String[] args) {
        DataBase dataBase = DataBase.getInstance();

        dataBase.setVersion(0.1f);
        System.out.println(dataBase);

        DataBase anotherDataBase = DataBase.getInstance();
        // anotherDataBase has the same instance
        System.out.println(anotherDataBase);

        // change version to 0.2
        anotherDataBase.setVersion(0.2f);

        System.out.println("\nchange version\n\n" + dataBase);
        /**
         * EXAMPLE
         *
         * DataBase {
         *     version = 0.1
         * }
         * DataBase {
         *     version = 0.1
         * }
         *
         * change version
         * 
         * DataBase {
         *     version = 0.2
         * }
         */
    }
}
