package com.mustafa.repository;

import com.mustafa.entity.Teacher;

public class TeacherRepository extends RepositoryManager<Teacher,Long> {
    public TeacherRepository(){
        super(new Teacher());
    }
}
