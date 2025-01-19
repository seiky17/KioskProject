package com.example.kiosk.Lv6;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<MenuItem> burgersList = new ArrayList<>();
    private final List<MenuItem> drinksList = new ArrayList<>();
    private final List<MenuItem> dessertsList = new ArrayList<>();
    private final List<String> mainMenuList = new ArrayList<>();
    private final List<MenuItem> orderList = new ArrayList<>();


    public Menu () {
        setMainMenu();
    }

    public void setMainMenu () {
        mainMenuList.add("Burgers");
        mainMenuList.add("Drinks");
        mainMenuList.add("Desserts");
    }

    public List<String> getMainMenu () {
        return mainMenuList;
    }

    public void setBurgers () {
        burgersList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void setDrinks () {
        drinksList.add(new MenuItem("Coke", 1.5, "콜라"));
        drinksList.add(new MenuItem("Soda", 1.3, "사이다"));
        drinksList.add(new MenuItem("Coffee", 3.0, "커피"));
        drinksList.add(new MenuItem("Lemonade", 2.0, "레모네이드"));
    }

    public void setDesserts () {
        dessertsList.add(new MenuItem("pudding", 5.5, "달콤한 푸딩"));
        dessertsList.add(new MenuItem("macaroon", 2.5, "마카롱"));
        dessertsList.add(new MenuItem("ice cream", 1.5, "아이스크림"));
        dessertsList.add(new MenuItem("muffin", 4.0, "머핀"));
    }

    public void setOrderList (List<MenuItem> menuItemList, int index) {
        orderList.add(menuItemList.get(index));
    }

    public List<MenuItem> getBurgersList () {
        return burgersList;
    }

    public List<MenuItem> getDrinksList () {
        return drinksList;
    }

    public List<MenuItem> getDessertsList () {
        return dessertsList;
    }

    public List<MenuItem> getOrderList () {
        return orderList;
    }
}
