package edu.eci.ieti.taskplanner.Controller;

import edu.eci.ieti.taskplanner.Model.User;
import edu.eci.ieti.taskplanner.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserAPIController {

    @Autowired
    UserServices userServices;

    /**
     * out
     *
     * @return
     */
    @GetMapping("/all")
    @ResponseBody
    public List<User> getUsers() {
        return userServices.getUsersList();
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/userid/{userId}")
    @ResponseBody
    public User getUserById(@PathVariable("userId") String id) {
        return userServices.getUserById(id);
    }

    /**
     * @param user
     */
    @PostMapping("/new")
    public void createUser(@RequestBody User user) {
        userServices.createUser(user);
    }

    /**
     * @param user
     */
    @PutMapping("/update")
    public void updateUser(@RequestBody User user) {
        userServices.updateUser(user);
    }

    /**
     * @param userId
     */
    @DeleteMapping("delete/{userId}")
    public void removeUser(@PathVariable("userId") String userId) {
        userServices.removeUser(userId);
    }

    /**
     * @param userName
     * @return
     */
    @GetMapping("/username/{userName}")
    public User getUserByUserName(@PathVariable("userName") String userName) {
        return userServices.getUserByUserName(userName);
    }

}
