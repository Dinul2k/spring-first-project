package com.dinul.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Dinul",
                        "Kithsara",
                        LocalDate.now(),
                        "kithsaradinul@gmail.com",
                        23
                ),
                new Student(
                        "Wathma jana",
                        "Janananda",
                        LocalDate.now(),
                        "wathma@gmail.com",
                        23
                )
        );
    }
}
