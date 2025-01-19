package com.example.kiosk.Lv5;

// 햄버거의 필드를 관리하는 클래스
public class MenuItem {
    private final String name;
    private final double price;
    private final String text;

    public MenuItem (String name, double price, String text) {
        this.name = name;
        this.price = price;
        this.text = text;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getText() {
        return text;
    }

}
