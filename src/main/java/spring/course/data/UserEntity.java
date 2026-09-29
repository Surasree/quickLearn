package spring.course.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class UserEntity implements Serializable {
    public UserEntity(String firstName, String lastName, Integer membershipId, String creationTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipId = membershipId;
        this.creationTime = creationTime;
    }

    public UserEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Integer membershipId;
    private String creationTime;
}
