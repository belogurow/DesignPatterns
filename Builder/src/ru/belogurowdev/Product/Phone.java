package ru.belogurowdev.Product;

import ru.belogurowdev.OperatingSystem;

public class Phone {
    private String company,
            name;
    private float screenSize;
    private OperatingSystem operatingSystem;
    private Boolean isMiniJackEnabled;

    public Phone(String company, String name, float screenSize, OperatingSystem operatingSystem, Boolean isMiniJackEnabled) {
        this.company = company;
        this.name = name;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.isMiniJackEnabled = isMiniJackEnabled;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public Boolean getMiniJackEnabled() {
        return isMiniJackEnabled;
    }

    @Override
    public String toString() {
        return "Phone {" +
                "\n\tmodel = '" + company + ' '+ name +'\'' +
                ", \n\toperatingSystem = " + operatingSystem +
                ", \n\tscreenSize = '" + screenSize + "\'inch" +
                ", \n\tisMiniJackEnabled = " + isMiniJackEnabled +
                "\n}";
    }
}
