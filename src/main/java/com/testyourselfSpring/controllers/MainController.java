package com.testyourselfSpring.controllers;

import com.testyourselfSpring.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("/login")
    public String home() {
        return "login";
    }

    @GetMapping("/home")
    public String user() {
        return "userhome";
    }

    @PostMapping("/subjects")
    public String subjects(Model model) {
        model.addAttribute("sub", subjectRepository.findAll());
        return "subjects";
    }
}
