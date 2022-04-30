import data.controller.UserMenu;
import data.entity.User;
import data.repository.UserRepository;
import data.service.UserService;
import data.ui.ViewMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        UserService userService = new UserService();
//        userService.createUser(new User(sc.nextLong(), sc.next(),
//                sc.next(),sc.nextLong(), sc.next(),
//                sc.next(), sc.next(), sc.next(), LocalDate.parse(sc.next())));
//        userService.getItem(1);
//        System.out.println(userService.getItem(1));
//        userService.editUser(1L, new User(sc.nextLong(), sc.next(),
//                sc.next(),sc.nextLong(), sc.next(),
//                sc.next(), sc.next(), sc.next(), date));
//        System.out.println(userService.getItem(1));
//        userService.createUser(new User(sc.nextLong(), sc.next(),
//                sc.next(),sc.nextLong(), sc.next(),
//                sc.next(), sc.next(), sc.next(), date));
////

        ViewMenu viewMenu = new ViewMenu();
        viewMenu.show();


    }
}
