package edu.eci.ieti.taskplanner.Persistence;

import edu.eci.ieti.taskplanner.Model.User;

import java.util.List;

public interface UserPersistence {

    /**
     * @return
     */
    List<User> getUsersList();

    /**
     * @return
     */
    User getUserById(Integer id);

    /**
     *
     */
    void createUser(User user);

    /**
     * @param user
     */
    void updateUser(User user);

    /**
     * @param user
     */
    void removeUser(User user);
}
