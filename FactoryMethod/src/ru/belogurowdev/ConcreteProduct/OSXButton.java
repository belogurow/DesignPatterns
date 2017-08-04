package ru.belogurowdev.ConcreteProduct;

import ru.belogurowdev.Product.Button;

public class OSXButton implements Button {
    private String tittle,
            backgroundColor;

    public OSXButton() {
        System.out.println("created OSX Button");
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
        System.out.println("clicked on OSX Button");
    }

    @Override
    public String toString() {
        return "OSXButton {" +
                "\n\ttittle='" + tittle + '\'' +
                ", \n\tbackgroundColor='" + backgroundColor + '\'' +
                "\n}";
    }
}
