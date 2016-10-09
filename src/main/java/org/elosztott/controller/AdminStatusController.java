package main.java.org.elosztott.controller;

import main.java.org.elosztott.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import main.java.org.elosztott.service.UserManager;

import java.util.List;

/**
 * Created by makra on 2016. 09. 26..
 */
@Controller
public class AdminStatusController {
    @Autowired
    UserManager userManager;

    @ModelAttribute("userList")
    List<User> getUsers() {
        return userManager.getUsers();
    }

    @RequestMapping(value = "status")
    public String status() {
        return "admin/status";
    }

}
