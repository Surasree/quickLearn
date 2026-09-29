package spring.course.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends CrudRepository<UserEntity,Integer> {
}
