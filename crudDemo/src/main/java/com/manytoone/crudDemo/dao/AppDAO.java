package com.manytoone.crudDemo.dao;

import com.manytoone.crudDemo.entity.Instructor;
import com.manytoone.crudDemo.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);
    Instructor findById(int id);

    void deleteById(int id);

    InstructorDetail findInstructorDetailById(int id);
}
