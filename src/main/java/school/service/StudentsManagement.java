package school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import school.controller.SchoolDateDto;
import school.controller.SchoolDto;
import school.model.Student;
import school.repository.AbsenceService;
import school.repository.StudentService;

import java.time.LocalDate;
import java.util.SortedSet;

/**
 * Created by michal on 31.05.15.
 */
// business logic
@Component
public class StudentsManagement implements SchoolManagementService {
//Requirements - adding student to collection

    @Autowired
    StudentService studentRepo;

    @Autowired
    AbsenceService absenceRepo;

    @Override
    public boolean addNewStudent(SchoolDto schoolDto) {
        Student newStudent = new Student(schoolDto.getStudentName(), schoolDto.getStudentSurname());

        //dodajemy studentow do mapy ze zbiorem nieobecnosci
        //na poczatku nie ma potrzeby tworzenia kolekcji nieobecnosci dla wszystkich studentow w momencie ich dodania
        absenceRepo.getAbsenceRepository().put(newStudent, null);

        return studentRepo.addStudent(newStudent);
    }

    @Override
    public void deleteStudent(String name, String surname) {
        Student student = new Student(name, surname);
        studentRepo.deleteStudent(student);

        //usuwamy z kolekcji zbior nieobecnosci dla danego studenta
        absenceRepo.getAbsenceRepository().remove(new Student(name, surname));
    }

    @Override
    public Student findStudent(String name, String surname) {
        Student student = new Student(name, surname);
        return studentRepo.findStudent(student);
    }

    @Override
    public SortedSet<Student> showAllStudents() {
        return studentRepo.showAllStudents();
    }

    @Override
    public SortedSet<LocalDate> addAbsenceDate(Student student, SchoolDateDto dateDto) {

        LocalDate absenceDay = LocalDate.of(dateDto.getYear(),dateDto.getMonth(), dateDto.getDay());

        return absenceRepo.addAbsenceDate(student, absenceDay);
    }

    @Override
    public boolean removeAbsenceDate(Student student, SchoolDateDto dateDto) {

        LocalDate absenceDay = LocalDate.of(dateDto.getYear(),dateDto.getMonth(), dateDto.getDay());

        return absenceRepo.removeAbsenceDate(student, absenceDay);
    }

    @Override
    public SortedSet<LocalDate> getAbsenceDates(Student student) {

        return absenceRepo.getAbsenceDates(student);
    }
}

