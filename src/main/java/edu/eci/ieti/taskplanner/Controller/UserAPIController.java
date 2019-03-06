package edu.eci.ieti.taskplanner.Controller;

import edu.eci.ieti.taskplanner.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserAPIController {

    @Autowired
    UserServices userServices;

}
