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


    private Long id;
    @Id
    private String firstName;
    private String lastName;
    private Integer membershipId;
    private String creationTime;

    public UserEntity() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
