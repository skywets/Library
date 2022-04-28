package data.repository;

import data.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements Repository<User> {
    private List<User> users = new ArrayList<>();


    @Override
    public Optional<User> getItem(long id) {
        Optional<User> user = users.stream().filter(u -> u.getId() == id).findFirst();
        return user;
    }

    @Override
    public User addItem(User item) {
        users.add(new User(item.getId(), item.getLogin(), item.getPassword(), item.getEducationId(), item.getName(),
                item.getCountry(), item.getLanguage(), item.getEducation(), item.getBirthday()));
        return item;
    }

    @Override
    public User updateItem(User item) {
        User updateUser = users.stream().filter(u -> u.getId() == u.getId()).findFirst().orElseThrow();
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
}
