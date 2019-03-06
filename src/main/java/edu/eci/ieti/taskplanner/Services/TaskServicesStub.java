package edu.eci.ieti.taskplanner.Services;

import edu.eci.ieti.taskplanner.Model.Task;
import edu.eci.ieti.taskplanner.Model.User;
import edu.eci.ieti.taskplanner.Persistence.TaskPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class TaskServicesStub implements TaskServices {

    @Autowired
    TaskPersistence taskPersistence;

    @Override
    public List<Task> geTasksList() {
        return taskPersistence.geTasksList();
    }

    @Override
    public Task getTaskById(String id) {
        return taskPersistence.getTaskById(id);
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        return taskPersistence.getTasksByUserId(userId);
    }

    @Override
    public Task assignedTaskToUser(String taskId, User user) {
        return taskPersistence.assignedTaskToUser(taskId, user);
    }

    @Override
    public void removeTask() {

    }

    @Override
    public Task updateTask(Task task) {
        return taskPersistence.updateTask(task);
    }
}
