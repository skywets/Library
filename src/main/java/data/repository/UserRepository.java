package data.repository;

import data.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Repository<User>{
    private List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }

    @Override
    public User getItem(long id) {
        for (User user:users) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User addItem(User item) {
        users = new ArrayList<>();
        users.add(new User(item.getId(), item.getLogin(), item.getPassword(),
                item.getRegistryDate(), item.getEducationId(), item.getName(),
                item.getCountry(), item.getLanguage(), item.getEducation(), item.getBirthday()));
        return (User) users;
    }

    @Override
    public User updateItem(User item) {
        item.getId();
        item.getLogin();
        item.getPassword();
        item.getRegistryDate();
        item.getEducationId();
        item.getName();
        item.getCountry();
        item.getLanguage();
        item.getEducation();
        item.getBirthday();
        return item;
    }

    @Override
    public void deleteItem(long id) {
        users.removeIf(u -> u.getId() == id);
    }
}
