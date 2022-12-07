package springboot.service;


import springboot.models.User;

import java.util.List;

public interface UserService {
    List<User> allUser();

    User getUserById(Long id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
