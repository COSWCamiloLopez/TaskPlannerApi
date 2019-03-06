package edu.eci.ieti.taskplanner.Model;

/**
 *
 */
public class User {

    private Integer identification;
    private String fullFirstName;
    private String fullLastName;
    private String email;
    private String userName;
    private Integer phoneNumber;
    private String occupation;
    private String password;

    public Integer getIdentification() {
        return identification;
    }

    public void setIdentification(Integer identification) {
        this.identification = identification;
    }

    public String getFullFirstName() {
        return fullFirstName;
    }

    public void setFullFirstName(String fullFirstName) {
        this.fullFirstName = fullFirstName;
    }

    public String getFullLastName() {
        return fullLastName;
    }

    public void setFullLastName(String fullLastName) {
        this.fullLastName = fullLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
