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
    User getUserById();

    /**
     * @return
     */
    User createUser();

    /**
     * @return
     */
    User updateUser();

    /**
     *
     */
    void removeUser();
}
