package com.mbstu.ict.controller;

import com.mbstu.ict.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller //Controller class >> spring will not find the meaning of mapping without this keyword
public class adminController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        System.out.println("-----------index-------------");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Habib",56,"IT-01005"));
        studentList.add(new Student("Kabir",20,"IT-01006"));
        studentList.add(new Student("Zahid",29,"IT-01007"));
        studentList.add(new Student("Rahim",35,"IT-01008"));

        model.addAttribute("studentList", studentList);
        model.addAttribute("myMessage","Hey we have run it successfully.....");


        return "index"; // It is a jsp file
    }

    @RequestMapping(value = "/upsertStudent", method = RequestMethod.GET)
    public String studentView(Model model) {
        System.out.println("-----------index-------------");
        Student student = new Student("Sumon", 55, "IT-10220");
        model.addAttribute("student", student);
        return "student";
    }

    @RequestMapping(value = "/upsertStudent", method = RequestMethod.POST)
    public String studentPost(Model model, @ModelAttribute("student") Student student) {
        System.out.println("-----------studentPost-------------");
        System.out.println(student);
        return "redirect:./";
    }
}
