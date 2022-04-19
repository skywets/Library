import data.repository.BookService;
import data.repository.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        System.out.print(userService.signUp());
        System.out.println(userService.signIn(scanner.next(), scanner.next()));
        userService.signOut();
//
//        BookService bookService = new BookService();
//        System.out.println(bookService.add());
//        bookService.delete(1);
//        System.out.println(bookService.add());
//        System.out.println(bookService.getAll(2));
//        bookService.update(2);
//        System.out.println(bookService.getAll(2));
    }
}
