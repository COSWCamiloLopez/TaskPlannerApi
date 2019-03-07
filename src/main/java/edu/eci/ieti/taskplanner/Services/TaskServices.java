package edu.eci.ieti.taskplanner.Services;

import edu.eci.ieti.taskplanner.Model.Task;
import edu.eci.ieti.taskplanner.Model.User;

import java.util.List;

public interface TaskServices {

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
     */
    void assignedTaskToUser(String taskId, User user);

    /**
     *
     */
    void removeTask(String taskId);

    /**
     * @param task
     */
    void updateTask(Task task);

}
