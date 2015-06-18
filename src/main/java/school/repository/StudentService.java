package school.repository;

import school.model.Student;

import java.util.SortedSet;

/**
 * Created by michal on 26.05.15.
 */
public interface StudentService {

    boolean addStudent (Student newStudent);
    Student findStudent (Student student);
    SortedSet<Student> showAllStudents();
    boolean isStudentRegistered(Student student);
    boolean deleteStudent(Student student);
}
