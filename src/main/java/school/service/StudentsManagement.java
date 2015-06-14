package school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import school.controller.SchoolDto;
import school.model.Student;
import school.repository.StudentService;

import java.util.SortedSet;

/**
 * Created by michal on 31.05.15.
 */
// business logic
    @Component
public class StudentsManagement implements SchoolManagementService{
//Requirements - adding student to collection

   @Autowired
   StudentService studentRepo;

       @Override
    public boolean addNewStudent(SchoolDto schoolDto) {
           Student newStudent = new Student(schoolDto.getStudentName(),schoolDto.getStudentSurname());
           return studentRepo.addStudent(newStudent);
    }

    @Override
    public void deleteStudent(String name, String surname) {
        studentRepo.deleteStudent(name, surname);
    }

    @Override
    public Student findStudent(String name, String surName) {
        return studentRepo.findStudent(name, surName);
    }

    @Override
    public SortedSet<Student> showAllStudents() {
        return studentRepo.showAllStudents();
    }
}

