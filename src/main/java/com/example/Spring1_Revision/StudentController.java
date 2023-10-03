package com.example.Spring1_Revision;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {

    HashMap<Integer, Student> sdb = new HashMap<>();
    @GetMapping("/get_info")
    public Student getStudent(@RequestParam("id") int adnmNo){
        return sdb.get(adnmNo);

    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        sdb.put(student.getAdmnNo(),student);

        return "Student added Successfully";
    }
}
