package ru.belogurowdev.ConcreteBuilder;

import ru.belogurowdev.Builder.Builder;
import ru.belogurowdev.OperatingSystem;
import ru.belogurowdev.Product.Tablet;

/**
 * In this example Phone and Tablet has the same signature.
 * Products in your projects can be different
 */
public class TabletBuilder implements Builder {
    private String company,
            name;
    private float screenSize;
    private OperatingSystem operatingSystem;
    private Boolean isMiniJackEnabled;

    @Override
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void isMiniJackEnabled(Boolean isEnabled) {
        this.isMiniJackEnabled = isEnabled;
    }

    /**
     * Building new product - Tablet
     * it's analog of getResult()
     */
    public Tablet build() {
        return new Tablet(company, name, screenSize, operatingSystem, isMiniJackEnabled);
    }
}
