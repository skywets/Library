package data.ui;

import data.controller.UserMenu;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class ViewMenu {
    Scanner sc;
    UserMenu menu = new UserMenu();

    public ViewMenu(Scanner sc, UserMenu menu) {
        this.sc = sc;
        this.menu = menu;
    }

    public ViewMenu() {
    }

    public void show() {
        sc = new Scanner(System.in);
        while (true) {
            System.out.println("Main menu");
            System.out.println("1. Show Users");
            System.out.println("2. Add User");
            System.out.println("3. Edit User");
            System.out.println("4. Delete User");
            System.out.println("0. Exit");
            int answer = sc.nextInt();
            try {
                switch (answer) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        System.out.println("Enter user id which you want see!");
                        System.out.println(menu.getItem(sc.nextLong()));
                        break;
                    case 2:
                        menu.showAddUser();
                        break;
                    case 3:
                        menu.showEditUser();
                        break;
                    case 4:
                        System.out.println("Enter user id which you want delete!");
                        menu.showDelete(sc.nextLong());
                        break;
                    default:
                        System.out.println("There is no such command! Try again!");
                        break;
                }
            } catch (MissingFormatArgumentException e) {
                System.out.println("There is no such command! Try again!");
            }
        }
    }
}
