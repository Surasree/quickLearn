package spring.course.services;

import spring.course.model.UserModel;

public interface UserService {
    UserModel getUser(String userName);
    void addUser(UserModel user);
    void deleteUser(String userName);
}
