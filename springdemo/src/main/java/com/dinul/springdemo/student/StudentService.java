package com.dinul.springdemo.student;

import java.util.List;

 public interface StudentService {

     Student save(Student s);
     List<Student> findAllStudents();

     Student findByEmail(String email);
     Student update (Student email);

     void delete(String email);
 }
