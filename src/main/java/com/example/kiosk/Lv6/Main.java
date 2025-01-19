package com.example.kiosk.Lv6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu burgers = new Menu();
        Menu drinks = new Menu();
        Menu desserts = new Menu();

        burgers.setBurgers();
        drinks.setDrinks();
        desserts.setDesserts();

        List<Menu> mainMenu = new ArrayList<>();
        mainMenu.add(burgers);
        mainMenu.add(drinks);
        mainMenu.add(desserts);

        Kiosk kiosk = new Kiosk(mainMenu);

        kiosk.start();

    }


}
