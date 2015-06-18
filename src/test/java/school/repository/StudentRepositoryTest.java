package school.repository;

import org.junit.Test;
import school.model.Student;

import static org.junit.Assert.*;

/**
 * Created by michal on 27.05.15.
 */
public class StudentRepositoryTest {

    //    @Test
//    public void testEguals() throws Exception {
//        StudentRepository studentRepository = new StudentRepository();
//        studentRepository.setStudent(new Student("Michal", "Nowak"));
//        assertTrue("passing equal objects", studentRepository.eguals(new Student("Michal", "Nowak")));
//    };
//
//    @Test
//    public void testEgualsNull() throws Exception {
//        StudentRepository studentRepository = new StudentRepository();
//        studentRepository.setStudent(new Student("Michal", "Nowak"));
//        assertFalse("passing null object should return false", studentRepository.eguals(null));
//    };
//    @Test
//    public void testNotEguals() throws Exception {
//        StudentRepository studentRepository = new StudentRepository();
//        studentRepository.setStudent(new Student("Michal", "Nowak"));
//        assertFalse("passing unequal object should return false", studentRepository.eguals(new Student("Kamil","Nowak")));
//    };
//    @Test
//    public void testFindStudent() throws Exception {
//        StudentRepository studentRepo = new StudentRepository();
//        studentRepo.getStudentRepository().add(new Student("Jan", "Kowalski"));
//        studentRepo.getStudentRepository().add(new Student("Michal", "Kowalski"));
//        studentRepo.getStudentRepository().add(new Student("Tomek", "Bak"));
//
//        Student searchedStudent = studentRepo.findStudent("Tomek", "Bak");
//        assertTrue("returned object should be equal", searchedStudent.eguals("TomekBak"));
//    }
//
//    @Test
//    public void testNotFoundStudent() throws Exception {
//        StudentRepository studentRepo = new StudentRepository();
//        studentRepo.getStudentRepository().add(new Student("Jan", "Kowalski"));
//        studentRepo.getStudentRepository().add(new Student("Michal", "Kowalski"));
//        studentRepo.getStudentRepository().add(new Student("Tomek", "Bak"));
//
//        assertNull("should return null if student not found", studentRepo.findStudent("Agnieszka", "Balcerek"));
//    }
//
//    @Test
//    public void testFindStudentEmpty() throws Exception {
//        StudentRepository studentRepo = new StudentRepository();
//
//        assertNull("should return null if collection is empty", studentRepo.findStudent("Agnieszka", "Balcerek"));
//    }
//
//    @Test
//    public void addStudent() throws Exception {
//        StudentRepository studentRepo = new StudentRepository();
//        boolean result = studentRepo.addStudent(new Student("Jan", "Kowalski"));
//
//        assertTrue("adding should result in true", result);
//        assertTrue("should have found added student", studentRepo.findStudent("Jan", "Kowalski").eguals(new Student("Jan", "Kowalski")));
//    }
//
//    @Test
//    public void addSameStudent() throws Exception {
//        StudentRepository studentRepo = new StudentRepository();
//        studentRepo.addStudent(new Student("Jan", "Kowalski"));
//        studentRepo.addStudent(new Student("Jan", "Kowalski"));
//
//        assertTrue("should be 1 element in collection", studentRepo.getStudentRepository().size() == 2);
//
//    }
//
//    @Test
//    public void removeStudent() throws Exception {
//        StudentRepository studentRepo = new StudentRepository();
//        studentRepo.getStudentRepository().add(new Student("Jan", "Kowalski"));
//        boolean status = studentRepo.deleteStudent("Jan", "Kowalski");
//
//        assertTrue("set should have been empty and deletion succesfull", (studentRepo.getStudentRepository().size() == 0) && status);
//    }
}


