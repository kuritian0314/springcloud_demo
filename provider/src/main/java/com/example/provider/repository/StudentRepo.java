package com.example.provider.repository;

import com.example.provider.entity.Student;

import java.util.Collection;

public interface StudentRepo{

    Collection<Student> findAll();

    Student findById(Integer id);

    void update(Student student);

    void deleteById(Integer id);
}
