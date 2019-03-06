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
    public User getUserById() {
        return userPersistence.getUserById();
    }

    @Override
    public User createUser() {
        return userPersistence.createUser();
    }

    @Override
    public User updateUser() {
        return userPersistence.updateUser();
    }

    @Override
    public void removeUser() {

    }
}
