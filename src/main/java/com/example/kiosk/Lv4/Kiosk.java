package com.example.kiosk.Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<Menu> menuList;

    public Kiosk (List<Menu> menuList) {
        this.menuList = menuList;
    }
    public void start() {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

            while (true) {
                System.out.println("[ MAIN MENU ]");

                List<String> mainMenu = menu.getMainMenu();
                for (int i = 0; i < mainMenu.size(); i++) {
                    System.out.println(i+1 + ". " + mainMenu.get(i));
                }
                System.out.println("0. 종료");


                int number = sc.nextInt();

                // MAIN MENU 에서의 선택
                if(number == 1) {
                    while (true) {
                        System.out.println();

                        System.out.println("[ BURGERS MENU ]");
                        Menu burgersMenu = menuList.get(0);
                        burgerPrintMenu(burgersMenu);

                        int menuNumber = sc.nextInt();

                        if(menuNumber == 1) {
                            burgerItemPrint(burgersMenu, 0);
                            break;
                        } else if (menuNumber == 2) {
                            burgerItemPrint(burgersMenu, 1);
                            break;
                        } else if (menuNumber == 3) {
                            burgerItemPrint(burgersMenu, 2);
                            break;
                        } else if (menuNumber == 4) {
                            burgerItemPrint(burgersMenu, 3);
                            break;
                        } else if (menuNumber == 0) {
                            break;
                        } else {
                            System.out.println("잘못된 숫자를 입력하였습니다.");
                        }
                    }
                } else if (number == 2) {
                    while (true) {
                        System.out.println();

                        System.out.println("[ DRINKS MENU ]");
                        Menu drinksMenu = menuList.get(1);
                        drinkPrintMenu(drinksMenu);

                        int menuNumber = sc.nextInt();

                        if(menuNumber == 1) {
                            drinkItemPrint(drinksMenu, 0);
                            break;
                        } else if (menuNumber == 2) {
                            drinkItemPrint(drinksMenu, 1);
                            break;
                        } else if (menuNumber == 3) {
                            drinkItemPrint(drinksMenu, 2);
                            break;
                        } else if (menuNumber == 4) {
                            drinkItemPrint(drinksMenu, 3);
                            break;
                        } else if (menuNumber == 0) {
                            break;
                        } else {
                            System.out.println("잘못된 숫자를 입력하였습니다.");
                        }
                    }

                } else if (number == 3) {
                    while (true) {
                        System.out.println();

                        System.out.println("[ DESSERTS MENU ]");
                        Menu dessertsMenu = menuList.get(2);
                        dessertPrintMenu(dessertsMenu);

                        int menuNumber = sc.nextInt();

                        if(menuNumber == 1) {
                            dessertItemPrint(dessertsMenu, 0);
                            break;
                        } else if (menuNumber == 2) {
                            dessertItemPrint(dessertsMenu, 1);
                            break;
                        } else if (menuNumber == 3) {
                            dessertItemPrint(dessertsMenu, 2);
                            break;
                        } else if (menuNumber == 4) {
                            dessertItemPrint(dessertsMenu, 3);
                            break;
                        } else if (menuNumber == 0) {
                            break;
                        } else {
                            System.out.println("잘못된 숫자를 입력하였습니다.");
                        }
                    }
                } else if (number == 0) {
                    break;
                } else {
                    System.out.println("잘못된 숫자를 입력하였습니다.");
                }
            }
    }

    public void burgerPrintMenu (Menu printMenu) {
        for (int i = 0; i < printMenu.burgersList.size(); i++) {
            System.out.println(i+1 + ". " + printMenu.burgersList.get(i).name + "  | W "
                    + printMenu.burgersList.get(i).price + " | " + printMenu.burgersList.get(i).text);
        }
        System.out.println("0. 뒤로가기");
    }

    public void drinkPrintMenu (Menu printMenu) {
        for (int i = 0; i < printMenu.drinksList.size(); i++) {
            System.out.println(i+1 + ". " + printMenu.drinksList.get(i).name + "  | W "
                    + printMenu.drinksList.get(i).price + " | " + printMenu.drinksList.get(i).text);
        }
        System.out.println("0. 뒤로가기");
    }

    public void dessertPrintMenu (Menu printMenu) {
        for (int i = 0; i < printMenu.dessertsList.size(); i++) {
            System.out.println(i+1 + ". " + printMenu.dessertsList.get(i).name + "  | W "
                    + printMenu.dessertsList.get(i).price + " | " + printMenu.dessertsList.get(i).text);
        }
        System.out.println("0. 뒤로가기");
    }

    public void burgerItemPrint (Menu printMenu, int number) {
        System.out.println("선택한 메뉴: " + printMenu.burgersList.get(number).name + "  | W "
                + printMenu.burgersList.get(number).price + " | " + printMenu.burgersList.get(number).text);
        System.out.println();
    }

    public void drinkItemPrint (Menu printMenu, int number) {
        System.out.println("선택한 메뉴: " + printMenu.drinksList.get(number).name + "  | W "
                + printMenu.drinksList.get(number).price + " | " + printMenu.drinksList.get(number).text);
        System.out.println();
    }

    public void dessertItemPrint (Menu printMenu, int number) {
        System.out.println("선택한 메뉴: " + printMenu.dessertsList.get(number).name + "  | W "
                + printMenu.dessertsList.get(number).price + " | " + printMenu.dessertsList.get(number).text);
        System.out.println();
    }
}
