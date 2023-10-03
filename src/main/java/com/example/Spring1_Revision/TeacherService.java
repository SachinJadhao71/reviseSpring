package com.example.Spring1_Revision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {


    @Autowired
    TeacherRepository teacherRepository;
    public Teacher getTeacher(int id) {
        return teacherRepository.getTeacher(id);
    }
}
