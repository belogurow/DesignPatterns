package ru.belogurowdev.Singleton;

public class DataBase {
    private float version;
    private static DataBase ourInstance = new DataBase();

    public static DataBase getInstance() {
        return ourInstance;
    }

    private DataBase() {
    }

    public void setVersion(float newVersion) {
        this.version = newVersion;
    }

    public float getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "DataBase {" +
                "\n\tversion = " + version +
                "\n}";
    }
}
