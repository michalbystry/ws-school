package school.repository;

import org.springframework.stereotype.Repository;
import school.model.Student;

import javax.validation.constraints.AssertFalse;
import java.text.Collator;
import java.util.*;

/**
 * Created by michal on 24.05.15.
 */
@Repository
public class StudentRepository implements StudentService {

    private SortedSet<Student> studentRepository = new TreeSet<>(new StudentComparator());

    public SortedSet<Student> getStudentRepository() {
        return studentRepository;
    }

    @Override
    public SortedSet<Student> showAllStudents() {
        return Collections.unmodifiableSortedSet(studentRepository);
    }


    public Student findStudent(String name, String surname) {
//        if (!studentRepository.isEmpty() && name != null && surname != null) {
        if (name == null && surname == null) {
            return null;
        }
        Student searchedStudent = new Student(name, surname);
        if (!studentRepository.isEmpty() && studentRepository.contains(searchedStudent)) {
//            Student searchedStudent = new Student(name, surname);
            Iterator<Student> it = studentRepository.iterator();
            while (it.hasNext()) {
                Student student = it.next();
                if (student.eguals(searchedStudent)) {
                    return student;
                }
                ;
            }
        } else {
            return null;
        }
        return null;
    }

    @Override
    public boolean addStudent(Student newStudent) {
        if (newStudent != null) {
            studentRepository.add(newStudent);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteStudent(String name, String surname) {
        Student removedStudent = findStudent(name, surname);
        if (removedStudent != null) {
            studentRepository.remove(removedStudent);
            return true;
        } else {
            return false;
        }
    }
}


//    @Override
//    public boolean addStudent(String name, String surname) {
//        if (name != null && surname != null) {
////            try{
//            studentRepository.add(new Student(name, surname));
//            return true;
////            }
////            catch (Exception e){
////                System.out.println("");;
////            }
//        }
//        else {
//            return false;
//        }
//    }

//    @Override
//    public void deleteStudent(String name, String surname) {
//    }
//}
////        @Override
////        public void addStudent (Student student){
////            studentRepository.add(student);
////
////
////        }
//
//    @Override
//    public void deleteStudent(String name, String surname) {
//        if (studentRepository.contains(student)) {
//            studentRepository.remove(student);
//        }


