package data.repository;

import data.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Repository<User> {
    private List<User> users = new ArrayList<>();

    @Override
    public User getItem(long id) {
        return findUserById(id);
    }

    private User findUserById(long id) {
        return users.stream().filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public User addItem(User item) {
        users.add(new User(item.getId(), item.getLogin(), item.getPassword(), item.getEducationId(), item.getName(),
                item.getCountry(), item.getLanguage(), item.getEducation(), item.getBirthday()));
        return item;
    }

    @Override
    public User updateItem(User item) {
        User updateUser = findUserById(item.getId());
        updateUser.setId(item.getId());
        updateUser.setLogin(item.getLogin());
        updateUser.setPassword(item.getPassword());
        updateUser.setEducationId(item.getEducationId());
        updateUser.setName(item.getName());
        updateUser.setCountry(item.getCountry());
        updateUser.setLanguage(item.getLanguage());
        updateUser.setEducation(item.getEducation());
        updateUser.setBirthday(item.getBirthday());
        return updateUser;
    }

    @Override
    public void deleteItem(long id) {
        users.removeIf(u -> u.getId() == id);
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
