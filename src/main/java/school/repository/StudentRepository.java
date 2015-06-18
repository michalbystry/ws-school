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


    public Student findStudent(Student student) {

        if (!studentRepository.isEmpty() && studentRepository.contains(student)) {
            Iterator<Student> it = studentRepository.iterator();
            while (it.hasNext()) {
                Student studentIterator = it.next();
                if (studentIterator.eguals(student)) {
                    return studentIterator;
                }
            }
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
    public boolean deleteStudent(Student student) {
        Student removedStudent = findStudent(student);
        if (studentRepository.contains(student)) {
            studentRepository.remove(student);
            return true;
        } else {
            return false;
        }
    }

    public boolean isStudentRegistered(Student student){
        return studentRepository.contains(student);
    }
}




