package ru.belogurowdev.Builder;

import ru.belogurowdev.OperatingSystem;

public interface Builder {
    public void setCompany(String company);
    public void setName(String name);
    public void setOperatingSystem(OperatingSystem operatingSystem);
    public void setScreenSize(float screenSize);    // inch
    public void isMiniJackEnabled(Boolean isEnabled);

    // etc.
}
