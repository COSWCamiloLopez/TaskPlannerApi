package edu.eci.ieti.taskplanner.Controller;

import edu.eci.ieti.taskplanner.Model.Task;
import edu.eci.ieti.taskplanner.Model.User;
import edu.eci.ieti.taskplanner.Services.TaskServices;
import edu.eci.ieti.taskplanner.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/task")
public class TaskAPIController {

    @Autowired
    TaskServices taskServices;


    /**
     * @return
     */
    @GetMapping("/all")
    @ResponseBody
    public List<Task> getTasksList() {
        return taskServices.geTasksList();
    }

    /**
     * @param taskId
     * @return
     */
    @GetMapping("{taskId}")
    @ResponseBody
    public Task getTaskById(@PathVariable("taskId") String taskId) {
        return taskServices.getTaskById(taskId);
    }

    /**
     * @param userId
     * @return
     */
    @GetMapping("/user/{userId}")
    @ResponseBody
    public List<Task> getTasksByUserId(@PathVariable("userId") String userId) {
        return taskServices.getTasksByUserId(userId);
    }

    /**
     * @param user
     * @param taskId
     */
    @PutMapping("/assign/{taskId}")
    public void assignTaskToUser(@RequestBody User user, @PathVariable("taskId") String taskId) {
        taskServices.assignedTaskToUser(taskId, user);
    }

    /**
     * @param taskId
     */
    @DeleteMapping("/delete/{taskId}")
    public void removeTask(@PathVariable("taskId") String taskId) {
        taskServices.removeTask(taskId);
    }

    /**
     * @param task
     */
    @PutMapping("/update")
    public void updateTask(@RequestBody Task task) {
        taskServices.updateTask(task);
    }

    /**
     * @param task
     */
    @PostMapping("/newtask")
    public void createNewTask(@RequestBody Task task) {
        taskServices.createNewTask(task);
    }
}
