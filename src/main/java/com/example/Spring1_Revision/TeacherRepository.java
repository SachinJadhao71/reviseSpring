package com.example.Spring1_Revision;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class TeacherRepository {

    HashMap<Integer,Teacher> map = new HashMap<>();
    public Teacher getTeacher(int id) {

        return map.get(id);
    }
}
