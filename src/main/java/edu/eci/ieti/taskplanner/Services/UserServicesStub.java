package edu.eci.ieti.taskplanner.Services;

import edu.eci.ieti.taskplanner.Model.User;
import edu.eci.ieti.taskplanner.Persistence.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserServicesStub implements UserServices {

    @Autowired
    UserPersistence userPersistence;

    @Override
    public List<User> getUsersList() {
        return userPersistence.getUsersList();
    }

    @Override
    public User getUserById(String id) {
        return userPersistence.getUserById(id);
    }

    @Override
    public void createUser(User user) {
        userPersistence.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        userPersistence.updateUser(user);
    }

    @Override
    public void removeUser(String userId) {
        userPersistence.removeUser(userId);
    }
}
