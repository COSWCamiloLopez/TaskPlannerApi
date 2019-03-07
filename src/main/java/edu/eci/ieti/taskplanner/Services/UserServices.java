package edu.eci.ieti.taskplanner.Services;

import edu.eci.ieti.taskplanner.Model.User;

import java.util.List;

public interface UserServices {

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
