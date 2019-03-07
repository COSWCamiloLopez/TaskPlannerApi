package edu.eci.ieti.taskplanner.Persistence.Impl;

import edu.eci.ieti.taskplanner.Model.Task;
import edu.eci.ieti.taskplanner.Model.User;
import edu.eci.ieti.taskplanner.Persistence.TaskPersistence;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Service
public class InMemoryTaskPersistence implements TaskPersistence {

    private Task task1 = new Task("1", "12345", "Hola", "", new Date());
    private Task task2 = new Task("2", "67890", "Hola", "", new Date());
    private List<Task> tasksList = new ArrayList<>();

    public InMemoryTaskPersistence() {
        tasksList.add(task1);
        tasksList.add(task2);
    }

    @Override
    public List<Task> geTasksList() {
        return tasksList;
    }

    @Override
    public Task getTaskById(String id) {
        Task taskToReturn = null;
        for (Task x : tasksList) {
            if (x.getId().equals(id)) {
                taskToReturn = x;
            }
        }
        return taskToReturn;
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {

        List<Task> listToReturn = new ArrayList<>();
        for (Task x : tasksList) {
            if (x.getOwner().equals(userId)) {
                listToReturn.add(x);
            }
        }
        return listToReturn;
    }

    @Override
    public void assignedTaskToUser(String taskId, User user) {
        for (Task x : tasksList) {
            if (x.getId().equals(taskId)) {
                x.setResponsible(user.getIdentification());
            }
        }
    }

    @Override
    public void removeTask(String taskId) {
        tasksList.remove(getTaskById(taskId));
    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }
}
