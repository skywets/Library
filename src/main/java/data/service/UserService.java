package data.service;

import data.entity.User;
import data.repository.UserRepository;

import java.util.Optional;

public class UserService {
    private UserRepository ur = new UserRepository();


    //здесь тоже OPTIONAL Чтобы не веннулся nosuchelementEXception, а вернулся Optional.empty, так?
    public Optional<User> getItem(long id) {
        return ur.getItem(id).stream().findFirst();
    }

    public void createUser(User user) {
        ur.addItem(user);
    }

    public void editUser(long id, User user) {
        user.setId(id);
        ur.updateItem(user);
    }

    public void deleteBook(long id) {
        ur.deleteItem(id);
    }
}
