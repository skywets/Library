package data.controller;

import data.entity.User;
import data.service.UserService;

import java.time.LocalDate;
import java.util.Scanner;

public class UserMenu {

    private long id;
    private String login;
    private String password;
    private long educationId;
    private String name;
    private String country;
    private String language;
    private String education;
    private LocalDate birthday;
    UserService userService = new UserService();
    Scanner sc = new Scanner(System.in);

    public UserMenu() {
    }

    public UserMenu(long id, String login, String password, long educationId, String name, String country, String language, String education, LocalDate birthday, UserService userService, User user) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.educationId = educationId;
        this.name = name;
        this.country = country;
        this.language = language;
        this.education = education;
        this.birthday = birthday;
        this.userService = userService;
    }

    public void showAddUser() {
        System.out.println("Enter user id: ");
        id = sc.nextLong();
        System.out.println("Enter user login: ");
        login = sc.next();
        System.out.println("Enter user password: ");
        password = sc.next();
        System.out.println("Enter education id: ");
        educationId = sc.nextLong();
        System.out.println("Enter user name: ");
        name = sc.next();
        System.out.println("Enter user country: ");
        country = sc.next();
        System.out.println("Enter user language: ");
        language = sc.next();
        System.out.println("Enter user education: ");
        education = sc.next();
        System.out.println("Enter user birthday: ");
        birthday = LocalDate.parse(sc.next());
        userService.createUser(new User(id, login, password, educationId,
                name, country, language, education, birthday));
    }

    public void showEditUser() {
        System.out.println("Enter user id: ");
        id = sc.nextLong();
        System.out.println("Enter user login: ");
        login = sc.next();
        System.out.println("Enter user password: ");
        password = sc.next();
        System.out.println("Enter education id: ");
        educationId = sc.nextLong();
        System.out.println("Enter user name: ");
        name = sc.next();
        System.out.println("Enter user country: ");
        country = sc.next();
        System.out.println("Enter user language: ");
        language = sc.next();
        System.out.println("Enter user education: ");
        education = sc.next();
        System.out.println("Enter user birthday: ");
        birthday = LocalDate.parse(sc.next());
        userService.editUser(id, new User(id, login, password, educationId, name, country, language, education, birthday));

    }

    public User getItem(long id) {
        return userService.getItem(id);
    }

    public void showDelete(long id) {
        userService.deleteBook(id);
    }


}
