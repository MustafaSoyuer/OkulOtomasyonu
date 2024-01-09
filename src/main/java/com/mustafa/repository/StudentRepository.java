package com.mustafa.repository;

import com.mustafa.entity.Student;

public class StudentRepository extends RepositoryManager<Student,Long> {
    public StudentRepository(){
        super(new Student());
    }
}
