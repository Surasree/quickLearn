package spring.course.model;

public class UserModel {

    private String firstName;
    private String lastName;
    private Integer membershipId;
    private String creationTime;

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getMembershipId() {
        return membershipId;
    }

    public UserModel(String firstName, String lastName, Integer membershipId, String creationTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipId = membershipId;
        this.creationTime = creationTime;
    }

    public UserModel() {
    }
}
