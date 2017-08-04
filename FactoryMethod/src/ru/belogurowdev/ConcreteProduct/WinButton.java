package ru.belogurowdev.ConcreteProduct;

import ru.belogurowdev.Product.Button;

public class WinButton implements Button {
    private String tittle,
        backgroundColor;

    public WinButton() {
        System.out.println("created Win Button");
    }

    @Override
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public void onClick() {
        System.out.println("clicked on Win Button");
    }

    @Override
    public String toString() {
        return "WinButton{" +
                "\n\ttittle='" + tittle + '\'' +
                ", \n\tbackgroundColor='" + backgroundColor + '\'' +
                "\n}";
    }
}
