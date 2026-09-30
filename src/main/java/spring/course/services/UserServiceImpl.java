package spring.course.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.course.data.UserEntity;
import spring.course.data.UserRepository;
import spring.course.mappers.EntityMapper;
import spring.course.model.UserModel;

@Service
@Qualifier("Primary")
public class UserServiceImpl implements UserService {

    private final TimeService timeService;
    private final UserRepository userRepository;
    private final EntityMapper<UserEntity, UserModel> entityMapper;

    public UserServiceImpl(TimeService timeService, UserRepository userRepository, EntityMapper<UserEntity, UserModel> entityMapper) {
        this.timeService  = timeService;
        this.userRepository = userRepository;
        this.entityMapper = entityMapper;
    }

    @Override
    public UserModel getUser(String userName){
        UserEntity user = userRepository.findByFirstName(userName);
        return user == null ? null : entityMapper.map(user);
    }

    @Override
    public void addUser(UserModel user){
        user.setCreationTime(timeService.getCurrentTime("Amsterdam"));
        userRepository.save(entityMapper.reverseMap(user));
    }

    @Override
    @Transactional
    public void deleteUser(String userName){
        userRepository.deleteByFirstName(userName);
    }
}
