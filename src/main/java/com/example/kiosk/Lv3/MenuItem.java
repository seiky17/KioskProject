package com.example.kiosk.Lv3;

// 햄버거의 필드를 관리하는 클래스
public class MenuItem {
    String name;
    double price;
    String text;

    // 객체가 생성되면 생성된 객체의 필드에 값을 넣음
    public MenuItem(String name, double price, String text) {
        this.name = name;
        this.price = price;
        this.text = text;
    }
}
