package com.example.kiosk.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();
        // add 함수를 통해 MenuItem 객체를 List에 삽입
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            // 반복문을 통해 List 안에 있는 MenuItem을 하나씩 출력
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println(i+1 + ". " + menuItems.get(i).name + "  | W " + menuItems.get(i).price + " | " + menuItems.get(i).text);
            }
            System.out.println("0. 종료");

            // 사용자에게 번호를 입력받음
            int number = sc.nextInt();

            // 조건문으로 사용자의 입력에 대한 처리
            if(number == 1) {
                System.out.println(menuItems.get(0).name + "  | W " + menuItems.get(0).price + " | " + menuItems.get(0).text);
            } else if (number == 2) {
                System.out.println(menuItems.get(1).name + "  | W " + menuItems.get(1).price + " | " + menuItems.get(1).text);
            } else if (number == 3) {
                System.out.println(menuItems.get(2).name + "  | W " + menuItems.get(2).price + " | " + menuItems.get(2).text);
            } else if (number == 4) {
                System.out.println(menuItems.get(3).name + "  | W " + menuItems.get(3).price + " | " + menuItems.get(3).text);
            } else if (number == 0) {  // 0을 입력받으면 while 반복문 종료
                break;
            }
        }





    }
}
