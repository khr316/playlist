package org.example.khr.controller;

import org.example.khr.dao.MainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class MainController {
    @Autowired
    MainDao mainDao;

    @GetMapping("/")
    public String main(Model model){
        List<Map<String,Object>> list = mainDao.selectList();
        model.addAttribute("list",list);
        return "main";
    }
}
