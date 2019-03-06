package edu.eci.ieti.taskplanner.Persistence.Impl;

import edu.eci.ieti.taskplanner.Model.User;
import edu.eci.ieti.taskplanner.Persistence.UserPersistence;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class InMemoryUserPersistence implements UserPersistence {
    @Override
    public List<User> getUsersList() {
        return null;
    }

    @Override
    public User getUserById() {
        return null;
    }

    @Override
    public User createUser() {
        return null;
    }

    @Override
    public User updateUser() {
        return null;
    }

    @Override
    public void removeUser() {

    }
}
