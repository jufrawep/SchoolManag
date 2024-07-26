package com.jufrawep.schoolmanag.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Jufrawep",
                        "Stone",
                        "stonej@gmail.com",
                        LocalDate.now(),
                        20
                ),
                new Student(
                        "trick",
                        "Stone",
                        "stonet@gmail.com",
                        LocalDate.now(),
                        25
                )


        );
    }
}
