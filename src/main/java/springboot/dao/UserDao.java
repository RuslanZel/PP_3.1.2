package springboot.dao;

import springboot.models.User;

import java.util.List;

public interface UserDao {
    List<User> allUser();

    User getUserById(Long id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

}
