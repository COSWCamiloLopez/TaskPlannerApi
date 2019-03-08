package edu.eci.ieti.taskplanner.Model;

import java.util.List;

/**
 *
 */
public class User {

    private String identification;
    private String fullName;
    private String email;
    private String userName;
    private Integer phoneNumber;
    private String occupation;
    private String password;
    private List<Task> tasks;

    public User(String identification, String fullName, String email, String userName, Integer phoneNumber,
                String occupation, String password) {
        this.identification = identification;
        this.fullName = fullName;
        this.email = email;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
        this.password = password;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getIdentification() {
        return identification;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
