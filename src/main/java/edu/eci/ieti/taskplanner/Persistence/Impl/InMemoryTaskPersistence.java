package edu.eci.ieti.taskplanner.Persistence.Impl;

import edu.eci.ieti.taskplanner.Model.Task;
import edu.eci.ieti.taskplanner.Model.User;
import edu.eci.ieti.taskplanner.Persistence.TaskPersistence;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class InMemoryTaskPersistence implements TaskPersistence {

    private List<Task> tasksList;

    @Override
    public List<Task> geTasksList() {
        return null;
    }

    @Override
    public Task getTaskById(String id) {
        return null;
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        return null;
    }

    @Override
    public Task assignedTaskToUser(String taskId, User user) {
        return null;
    }

    @Override
    public void removeTask() {

    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }
}
