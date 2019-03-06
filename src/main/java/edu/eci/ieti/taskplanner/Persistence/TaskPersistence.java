package edu.eci.ieti.taskplanner.Persistence;


import edu.eci.ieti.taskplanner.Model.Task;
import edu.eci.ieti.taskplanner.Model.User;

import java.util.List;

public interface TaskPersistence {

    /**
     * @return
     */
    List<Task> geTasksList();

    /**
     * @param id
     * @return
     */
    Task getTaskById(String id);

    /**
     * @param userId
     * @return
     */
    List<Task> getTasksByUserId(String userId);

    /**
     * @param taskId
     * @param user
     * @return
     */
    Task assignedTaskToUser(String taskId, User user);

    /**
     *
     */
    void removeTask();

    /**
     * @param task
     * @return
     */
    Task updateTask(Task task);
}