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

    public UserService() {
        this.users = users;
    }

    Scanner scanner = new Scanner(System.in);
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
        user.setEducation(scanner.next());
        user.setBirthday(LocalDate.parse(scanner.next()));
         users.add(new User(user.getId(), user.getLogin(), user.getPassword(), user.getRegistryDate(),
                user.getEducationId(),user.getName(), user.getCountry(), user.getLanguage(), user.getEducation(),
                user.getBirthday()));
         return user;
    }

    public User signIn(String login, String password) {
        if (login == user.getLogin() && password == user.getPassword()){
            return user;
        }
            return null;
    }
}
