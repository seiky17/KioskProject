package com.example.kiosk.Lv5;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menuList;

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
                        printBurgerMenu(burgersMenu);

                        int menuNumber = sc.nextInt();

                        if(menuNumber == 1) {
                            printBurgerItem(burgersMenu, 0);
                            break;
                        } else if (menuNumber == 2) {
                            printBurgerItem(burgersMenu, 1);
                            break;
                        } else if (menuNumber == 3) {
                            printBurgerItem(burgersMenu, 2);
                            break;
                        } else if (menuNumber == 4) {
                            printBurgerItem(burgersMenu, 3);
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
                        printDrinkMenu(drinksMenu);

                        int menuNumber = sc.nextInt();

                        if(menuNumber == 1) {
                            printDrinkItem(drinksMenu, 0);
                            break;
                        } else if (menuNumber == 2) {
                            printDrinkItem(drinksMenu, 1);
                            break;
                        } else if (menuNumber == 3) {
                            printDrinkItem(drinksMenu, 2);
                            break;
                        } else if (menuNumber == 4) {
                            printDrinkItem(drinksMenu, 3);
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
                        printDessertMenu(dessertsMenu);

                        int menuNumber = sc.nextInt();

                        if(menuNumber == 1) {
                            printDessertItem(dessertsMenu, 0);
                            break;
                        } else if (menuNumber == 2) {
                            printDessertItem(dessertsMenu, 1);
                            break;
                        } else if (menuNumber == 3) {
                            printDessertItem(dessertsMenu, 2);
                            break;
                        } else if (menuNumber == 4) {
                            printDessertItem(dessertsMenu, 3);
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

    public void printBurgerMenu (Menu printMenu) {
        for (int i = 0; i < printMenu.getBurgersList().size(); i++) {
            System.out.println(i+1 + ". " + printMenu.getBurgersList().get(i).getName() + "  | W "
                    + printMenu.getBurgersList().get(i).getPrice() + " | " + printMenu.getBurgersList().get(i).getText());
        }
        System.out.println("0. 뒤로가기");
    }

    public void printDrinkMenu (Menu printMenu) {
        for (int i = 0; i < printMenu.getDrinksList().size(); i++) {
            System.out.println(i+1 + ". " + printMenu.getDrinksList().get(i).getName() + "  | W "
                    + printMenu.getDrinksList().get(i).getPrice() + " | " + printMenu.getDrinksList().get(i).getText());
        }
        System.out.println("0. 뒤로가기");
    }

    public void printDessertMenu (Menu printMenu) {
        for (int i = 0; i < printMenu.getDessertsList().size(); i++) {
            System.out.println(i+1 + ". " + printMenu.getDessertsList().get(i).getName() + "  | W "
                    + printMenu.getDessertsList().get(i).getPrice() + " | " + printMenu.getDessertsList().get(i).getText());
        }
        System.out.println("0. 뒤로가기");
    }

    public void printBurgerItem (Menu printMenu, int number) {
        System.out.println("선택한 메뉴: " + printMenu.getBurgersList().get(number).getName() + "  | W "
                + printMenu.getBurgersList().get(number).getPrice() + " | " + printMenu.getBurgersList().get(number).getText());
        System.out.println();
    }

    public void printDrinkItem (Menu printMenu, int number) {
        System.out.println("선택한 메뉴: " + printMenu.getDrinksList().get(number).getName() + "  | W "
                + printMenu.getDrinksList().get(number).getPrice() + " | " + printMenu.getDrinksList().get(number).getText());
        System.out.println();
    }

    public void printDessertItem (Menu printMenu, int number) {
        System.out.println("선택한 메뉴: " + printMenu.getDessertsList().get(number).getName() + "  | W "
                + printMenu.getDessertsList().get(number).getPrice() + " | " + printMenu.getDessertsList().get(number).getText());
        System.out.println();
    }
}
