package data.repository;

import data.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserService {

    User user = new User();
    private List<User> users = new ArrayList<>();
    private List<User> loggedInUsers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public UserService() {
        this.users = users;
    }

    public User signUp() {
        System.out.println("Sign up");
        user.setId(scanner.nextLong());
        user.setLogin(scanner.next());
        user.setPassword(scanner.next());
        Date date = new Date();
        user.setRegistryDate(date);
        user.setEducationId(scanner.nextLong());
        user.setName(scanner.next());
        user.setCountry(scanner.next());
        user.setLanguage(scanner.next());
        user.setBirthday(LocalDate.parse(scanner.next()));
        users.add(new User(user.getId(), user.getLogin(), user.getPassword(), user.getRegistryDate(),
                user.getEducationId(), user.getName(), user.getCountry(), user.getLanguage(),
                user.getBirthday()));
        return user;
    }

    public User signIn(String login, String password) {
        if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
            loggedInUsers.add(getById(scanner.nextLong()));
        } else
            System.out.println("Incorrect login or password");
        return null;
    }

    public User getById(long id) {
        if (user.getId() == id) {
            for (User user : getUsers()) {
                return user;
            }
        } else
            System.out.println("The user does not exist for this id, try again");
        return null;
    }
    public void signOut() {
        loggedInUsers.remove(getById(1));
    }
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
