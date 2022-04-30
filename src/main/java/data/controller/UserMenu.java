package data.controller;

import data.entity.User;
import data.repository.UserRepository;
import data.service.UserService;

import java.time.LocalDate;
import java.util.Optional;
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
    UserRepository userRepository = new UserRepository();
    UserService userService = new UserService();
    User user = new User();
    Scanner sc = new Scanner(System.in);

    public UserMenu() {
    }

    public UserMenu( UserRepository userRepository, UserService userService, User user) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.user = user;
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
        userService.editUser(user.getId(), new User());
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

    }

    public Optional<User> getItem(long id){
       return userService.getItem(id);
    }

    public void showDelete(long id) {
        userService.deleteBook(id);
    }


}
