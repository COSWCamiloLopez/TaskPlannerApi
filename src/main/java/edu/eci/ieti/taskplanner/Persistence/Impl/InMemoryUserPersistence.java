package edu.eci.ieti.taskplanner.Persistence.Impl;

import edu.eci.ieti.taskplanner.Model.User;
import edu.eci.ieti.taskplanner.Persistence.UserPersistence;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class InMemoryUserPersistence implements UserPersistence {

    private User user1 = new User("12345", "a", "b", "c", "d");
    private User user2 = new User("67890", "e", "f", "g", "g");
    private List<User> usersList = new ArrayList<>();

    public InMemoryUserPersistence() {
        usersList.add(user1);
        usersList.add(user2);
    }

    @Override
    public List<User> getUsersList() {
        return usersList;
    }

    @Override
    public User getUserById(String id) {

        User userToReturn = null;

        for (User x : usersList) {
            if (x.getIdentification().equals(id)) {
                userToReturn = x;
            }
        }

        return userToReturn;
    }

    @Override
    public void createUser(User user) {
        usersList.add(user);
    }

    @Override
    public void updateUser(User user) {
        for (User x : usersList) {
            if (x.getIdentification().equals(user.getIdentification())) {
                removeUser(user.getIdentification());
                usersList.add(user);
            } else {
                System.out.println("User doesn't found");
            }
        }
    }

    @Override
    public void removeUser(String userId) {
        if (usersList.contains(getUserById(userId))) {
            usersList.remove(getUserById(userId));
        } else {
            System.out.println("This user doesn't exists");
        }
    }
}
