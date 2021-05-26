package com.example.provider.controller;

import com.example.provider.entity.Student;
import com.example.provider.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/stu")
public class StudentController {

    //自动注入dao层
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepo.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Integer id){
        return studentRepo.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepo.update(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepo.update(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        studentRepo.deleteById(id);
    }

}

