package school.service;

import school.controller.SchoolDateDto;
import school.controller.SchoolDto;
import school.model.Student;
import java.time.LocalDate;
import java.util.SortedSet;

/**
 * Created by michal on 31.05.15.
 */
public interface SchoolManagementService {
    boolean addNewStudent (SchoolDto schoolDto);
    Student findStudent (String name, String surName);
    SortedSet<Student> showAllStudents ();
    void deleteStudent(String name, String surname);


    //from AbsenceService
     SortedSet<LocalDate> addAbsenceDate(Student student, SchoolDateDto dateDto);
     boolean removeAbsenceDate(Student student, SchoolDateDto dateDto);
     SortedSet<LocalDate> getAbsenceDates(Student student);

//     SortedSet<LocalDate> getAbsenceDates(Student student);


}
