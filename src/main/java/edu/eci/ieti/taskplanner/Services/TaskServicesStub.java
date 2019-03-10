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
    public void assignedTaskToUser(String taskId, User user) {
        taskPersistence.assignedTaskToUser(taskId, user);
    }

    @Override
    public void removeTask(String taskId) {
        taskPersistence.removeTask(taskId);
    }

    @Override
    public void updateTask(Task task) {
        taskPersistence.updateTask(task);
    }

    @Override
    public void createNewTask(Task task) {
        taskPersistence.createNewTask(task);
    }
}
