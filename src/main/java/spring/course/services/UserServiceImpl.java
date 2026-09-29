package spring.course.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.course.data.UserRepository;
import spring.course.model.UserModel;

import java.util.HashMap;
import java.util.Map;

@Service
@Qualifier("Primary")
public class UserServiceImpl implements UserService {

    private final Map<String, UserModel> userMap = new HashMap<>();
    private final TimeService timeService;

    public UserServiceImpl(TimeService timeService, UserRepository userRepository) {
        this.timeService  = timeService;
        userMap.put("John", new UserModel("Red","John",1234));
        userMap.put("Patrick", new UserModel("Patrick","Jane",1235));
        System.out.printf("reached constructor!");
    }

    public UserModel getUser(String userName){
        return userMap.get(userName);
    }

    public void addUser(UserModel user){
        user.setCreationTime(timeService.getCurrentTime("Amsterdam"));
         userMap.put(user.getFirstName(), user);
    }

    public void deleteUser(String userName){
        userMap.remove(userName);
    }
}
