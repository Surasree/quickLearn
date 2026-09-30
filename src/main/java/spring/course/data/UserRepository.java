package spring.course.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Integer>{

        UserEntity findByFirstName(String firstName);
       // void save(UserEntity userEntity);
        void deleteByFirstName(String firstName);
}
