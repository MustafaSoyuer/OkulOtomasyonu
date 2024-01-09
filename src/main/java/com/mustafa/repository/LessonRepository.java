package com.mustafa.repository;

import com.mustafa.entity.Lesson;

public class LessonRepository extends RepositoryManager<Lesson,Long> {
    public LessonRepository(){
        super(new Lesson());
    }
}
