package com.example.Spring1_Revision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/get")
    public ResponseEntity getTeacher(@RequestParam("id") int id){

        Teacher t = teacherService.getTeacher(id);

        return new ResponseEntity<>(t, HttpStatus.ACCEPTED);
    }
}
