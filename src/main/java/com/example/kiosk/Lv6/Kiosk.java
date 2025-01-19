package com.example.kiosk.Lv6;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menuList;
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);

    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void start() {
        while (true) {
            try {
                System.out.println("[ MAIN MENU ]");

                List<String> mainMenu = menu.getMainMenu();

                for (int i = 0; i < mainMenu.size(); i++) {
                    System.out.println(i + 1 + ". " + mainMenu.get(i));
                }
                System.out.println("0. 종료");

                List<MenuItem> orderList = menu.getOrderList();
                if (!orderList.isEmpty()) {
                    System.out.println();
                    System.out.println("[ ORDER MENU ]");
                    System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                    System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
                }

                int number = sc.nextInt();

                // MAIN MENU 에서의 선택
                if (number == 1) { // 버거 메뉴 선택
                    while (true) {
                        try {
                            System.out.println();

                            System.out.println("[ BURGERS MENU ]");

                            Menu burgersMenu = menuList.get(0);
                            List<MenuItem> burgersItemList = burgersMenu.getBurgersList();
                            printBurgerMenu(burgersItemList);

                            int menuNumber = sc.nextInt();

                            if (menuNumber == 1) {
                                printBurgerItem(burgersItemList, 0);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(burgersItemList, 0);
                                    System.out.println(burgersItemList.get(0).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 2) {
                                printBurgerItem(burgersItemList, 1);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(burgersItemList, 1);
                                    System.out.println(burgersItemList.get(1).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 3) {
                                printBurgerItem(burgersItemList, 2);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(burgersItemList, 2);
                                    System.out.println(burgersItemList.get(2).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 4) {
                                printBurgerItem(burgersItemList, 3);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(burgersItemList, 3);
                                    System.out.println(burgersItemList.get(3).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }
                                break;
                            } else if (menuNumber == 0) {
                                break;
                            } else {
                                throw new InputMismatchException();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("잘못된 값을 입력하였습니다.");
                        }
                    } // while문 끝
                } else if (number == 2) { // 음료 메뉴 선택
                    while (true) {
                        try {
                            System.out.println();

                            System.out.println("[ DRINKS MENU ]");
                            Menu drinksMenu = menuList.get(1);
                            List<MenuItem> drinksItemList = drinksMenu.getDrinksList();
                            printDrinkMenu(drinksItemList);

                            int menuNumber = sc.nextInt();

                            if (menuNumber == 1) {
                                printDrinkItem(drinksItemList, 0);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(drinksItemList, 0);
                                    System.out.println(drinksItemList.get(0).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 2) {
                                printDrinkItem(drinksItemList, 1);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(drinksItemList, 1);
                                    System.out.println(drinksItemList.get(1).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 3) {
                                printDrinkItem(drinksItemList, 2);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(drinksItemList, 2);
                                    System.out.println(drinksItemList.get(2).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 4) {
                                printDrinkItem(drinksItemList, 3);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(drinksItemList, 3);
                                    System.out.println(drinksItemList.get(3).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 0) {
                                break;
                            } else {
                                throw new InputMismatchException();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("잘못된 숫자를 입력하였습니다.");
                        }
                    }
                } else if (number == 3) { // 디저트 메뉴 선택
                    while (true) {
                        try {
                            System.out.println("[ DESSERTS MENU ]");
                            Menu dessertsMenu = menuList.get(2);
                            List<MenuItem> dessertsItemList = dessertsMenu.getDessertsList();
                            printDessertMenu(dessertsItemList);

                            int menuNumber = sc.nextInt();

                            if (menuNumber == 1) {
                                printDessertItem(dessertsItemList, 0);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(dessertsItemList, 0);
                                    System.out.println(dessertsItemList.get(0).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 2) {
                                printDessertItem(dessertsItemList, 1);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(dessertsItemList, 1);
                                    System.out.println(dessertsItemList.get(1).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 3) {
                                printDessertItem(dessertsItemList, 2);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(dessertsItemList, 2);
                                    System.out.println(dessertsItemList.get(2).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 4) {
                                printDessertItem(dessertsItemList, 3);

                                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                System.out.println("1. 확인      2. 취소");
                                int orderNumber = sc.nextInt();

                                if (orderNumber == 1) {
                                    menu.setOrderList(dessertsItemList, 3);
                                    System.out.println(dessertsItemList.get(3).getName() + " 이(가) 장바구니에 추가되었습니다.");
                                    System.out.println();
                                } else if (orderNumber == 2) {
                                    break;
                                } else {
                                    throw new InputMismatchException();
                                }

                                break;
                            } else if (menuNumber == 0) {
                                break;
                            } else {
                                throw new InputMismatchException();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("잘못된 숫자를 입력하였습니다.");
                        }
                        System.out.println();


                    }
                } else if (!orderList.isEmpty() && number == 4) {
                    System.out.println("아래와 같이 주문 하시겠습니까?");
                    System.out.println();
                    System.out.println("[ Orders ]");

                    for (int i = 0; i < orderList.size(); i++) {
                        System.out.println(orderList.get(i).getName() + " | " + "W "
                                + orderList.get(i).getPrice() + " | " + orderList.get(i).getText());
                    }

                    System.out.println();

                    System.out.println("[ Total ]");
                    double total = 0;
                    for (int i = 0; i < orderList.size(); i++) {
                        total += orderList.get(i).getPrice();
                    }
                    System.out.println("W " + total);
                    System.out.println();

                    System.out.println("1. 주문      2. 메뉴판");
                    int orderChoice = sc.nextInt();

                    if (orderChoice == 1) {
                        System.out.println("주문이 완료되었습니다. 금액은 W " + total + " 입니다.");
                        orderList.clear();
                    } else if (orderChoice == 2) {
                        continue;
                    } else {
                        throw new InputMismatchException();
                    }
                } else if (!orderList.isEmpty() && number == 5) {
                    System.out.println("진행중인 주문을 취소했습니다.");
                    orderList.clear();
                } else if (number == 0) {
                    break;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 값을 입력하였습니다.");
            }
        }
    }


    public void printBurgerMenu(List<MenuItem> burgersItemList) {
        for (int i = 0; i < burgersItemList.size(); i++) {
            System.out.println(i + 1 + ". " + burgersItemList.get(i).getName() + "  | W "
                    + burgersItemList.get(i).getPrice() + " | " + burgersItemList.get(i).getText());
        }
        System.out.println("0. 뒤로가기");
    }

    public void printDrinkMenu(List<MenuItem> drinksItemList) {
        for (int i = 0; i < drinksItemList.size(); i++) {
            System.out.println(i + 1 + ". " + drinksItemList.get(i).getName() + "  | W "
                    + drinksItemList.get(i).getPrice() + " | " + drinksItemList.get(i).getText());
        }
        System.out.println("0. 뒤로가기");
    }

    public void printDessertMenu(List<MenuItem> dessertsItemList) {
        for (int i = 0; i < dessertsItemList.size(); i++) {
            System.out.println(i + 1 + ". " + dessertsItemList.get(i).getName() + "  | W "
                    + dessertsItemList.get(i).getPrice() + " | " + dessertsItemList.get(i).getText());
        }
        System.out.println("0. 뒤로가기");
    }

    public void printBurgerItem(List<MenuItem> burgersItemList, int number) {
        System.out.println("선택한 메뉴: " + burgersItemList.get(number).getName() + "  | W "
                + burgersItemList.get(number).getPrice() + " | " + burgersItemList.get(number).getText());
        System.out.println();
    }

    public void printDrinkItem(List<MenuItem> drinksItemList, int number) {
        System.out.println("선택한 메뉴: " + drinksItemList.get(number).getName() + "  | W "
                + drinksItemList.get(number).getPrice() + " | " + drinksItemList.get(number).getText());
        System.out.println();
    }

    public void printDessertItem(List<MenuItem> dessertsItemList, int number) {
        System.out.println("선택한 메뉴: " + dessertsItemList.get(number).getName() + "  | W "
                + dessertsItemList.get(number).getPrice() + " | " + dessertsItemList.get(number).getText());
        System.out.println();
    }
}


