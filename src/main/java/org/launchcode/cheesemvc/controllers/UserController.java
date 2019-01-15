package org.launchcode.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(name = "user")
public class UserController {

    @RequestMapping(name = "add", method = RequestMethod.GET)
    public String add(Model model) {
        return "user/add";
    }

}
