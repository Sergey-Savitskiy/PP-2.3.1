package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public List<User> getUsersList();
    public User getById(int id);
}
