package edu.eci.ieti.taskplanner.Persistence.Impl;

import edu.eci.ieti.taskplanner.Model.User;
import edu.eci.ieti.taskplanner.Persistence.UserPersistence;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
@Service
public class InMemoryUserPersistence implements UserPersistence {

    private User user1 = new User(12345, "a", "b", "c", "d");
    private List<User> usersList = Arrays.asList(user1);

    @Override
    public List<User> getUsersList() {
        return usersList;
    }

    @Override
    public User getUserById(Integer id) {

        User userToReturn = null;

        for (User x : usersList) {
            if (x.getIdentification() == id) {
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
            if (x.getIdentification() == user.getIdentification()) {
                removeUser(user);
                usersList.add(user);
            } else {
                System.out.println("User doesn't found");
            }
        }
    }

    @Override
    public void removeUser(User user) {
        if (usersList.contains(user)) {
            usersList.remove(user);
        } else {
            System.out.println("This user doesn't exists");
        }
    }
}
