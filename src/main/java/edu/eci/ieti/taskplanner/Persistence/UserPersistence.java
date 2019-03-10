package edu.eci.ieti.taskplanner.Persistence;

import edu.eci.ieti.taskplanner.Model.User;

import java.util.List;

public interface UserPersistence {

    /**
     * @return
     */
    List<User> getUsersList();

    /**
     * @param id
     * @return
     */
    User getUserById(String id);

    /**
     *
     */
    void createUser(User user);

    /**
     * @param user
     */
    void updateUser(User user);

    /**
     * @param userId
     */
    void removeUser(String userId);

    /**
     * @param userName
     * @return
     */
    User getUserByUserName(String userName);
}
