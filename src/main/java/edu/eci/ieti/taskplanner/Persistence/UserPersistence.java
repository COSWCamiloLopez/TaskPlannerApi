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
