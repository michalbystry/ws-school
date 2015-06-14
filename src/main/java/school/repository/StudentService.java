package school.repository;

import school.model.Student;

import java.util.SortedSet;

/**
 * Created by michal on 26.05.15.
 */
public interface StudentService {

    boolean addStudent (Student newStudent);
//    boolean addStudent (String name, String surname);
//    void deleteStudent (String name, String surname);
    Student findStudent (String name, String surName);
    SortedSet<Student> showAllStudents();

    boolean deleteStudent(String name, String surname);
}
