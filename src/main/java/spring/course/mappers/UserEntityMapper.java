package spring.course.mappers;

import org.springframework.stereotype.Component;
import spring.course.data.UserEntity;
import spring.course.model.UserModel;

@Component
public class UserEntityMapper implements EntityMapper<UserEntity,UserModel> {
    @Override
    public UserModel map(UserEntity entity) {
        return new UserModel(
                entity.getFirstName(),
                entity.getLastName(),
                entity.getMembershipId(),
                entity.getCreationTime()
        );
    }

    @Override
    public UserEntity reverseMap(UserModel entity) {
        return new UserEntity(
                entity.getFirstName(),
                entity.getLastName(),
                entity.getMembershipId(),
                entity.getCreationTime()
        );
    }
}
