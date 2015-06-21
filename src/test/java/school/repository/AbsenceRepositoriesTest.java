package school.repository;

import org.junit.Test;
import school.model.Student;
import java.time.LocalDate;

import static org.junit.Assert.*;

/**
 * Created by michal on 15.06.15.
 */
public class AbsenceRepositoriesTest {
//
//    @Test
//    public void testAddAbsenceDate() throws Exception {
//        Student student = new Student("Kamil", "Kowalski");
//        Student student2 = new Student("Anna", "Antczak");
//
//        AbsenceResource absence = new AbsenceResource();
//        AbsenceResource absence2 = new AbsenceResource();
//
//        AbsenceRepositories absenceRepo = new AbsenceRepositories();
//
//        absenceRepo.addAbsenceDate(student, absence, LocalDate.of(2015, 5, 10));
//        absenceRepo.addAbsenceDate(student, absence, LocalDate.of(2015, 5, 11));
//        absenceRepo.addAbsenceDate(student2, absence2, LocalDate.of(2015, 1, 12));
//        absenceRepo.addAbsenceDate(student2, absence2, LocalDate.of(2015, 1, 13));
//
//        assertTrue("added date not found", absenceRepo.getAbsenceDates(student).contains(LocalDate.of(2015, 5, 10)));
//        assertFalse("added date of different student found", absenceRepo.getAbsenceDates(student).contains(LocalDate.of(2015, 1, 12)));
//
//    }
//
//    @Test
//    public void testRemoveAbsenceDate() throws Exception {
//        Student student = new Student("Kamil", "Kowalski");
//        Student student2 = new Student("Anna", "Antczak");
//
//        AbsenceResource absence = new AbsenceResource();
//        AbsenceResource absence2 = new AbsenceResource();
//
//        AbsenceRepositories absenceRepo = new AbsenceRepositories();
//
//        absenceRepo.addAbsenceDate(student, absence, LocalDate.of(2015, 5, 10));
//        absenceRepo.addAbsenceDate(student, absence, LocalDate.of(2015, 5, 11));
//        absenceRepo.addAbsenceDate(student2, absence2, LocalDate.of(2015, 1, 12));
//        absenceRepo.addAbsenceDate(student2, absence2, LocalDate.of(2015, 1, 13));
//
//        boolean result=absenceRepo.removeAbsenceDate(student, absence, LocalDate.of(2015, 5, 10));
//
//        assertTrue("deletion should be successful",result);
//        assertFalse("date should have been deleted", absenceRepo.getAbsenceDates(student).contains(LocalDate.of(2015, 5, 10)));
//        assertFalse("student2 should not have date of student", absenceRepo.getAbsenceDates(student2).contains(LocalDate.of(2015, 5, 10)));
//
//        boolean result2 = absenceRepo.removeAbsenceDate(student, absence2, LocalDate.of(2015, 1, 12));
//
//        assertFalse("date of student 2 should have not been deleted", result2);
//        assertTrue("student2 date should have not been deleted", absenceRepo.getAbsenceDates(student2).contains(LocalDate.of(2015, 1, 12)));
//    }
//
    @Test
    public void testGetAbsenceDates() throws Exception {
        Student student = new Student("Kamil", "Kowalski");
        AbsenceRepositories absence = new AbsenceRepositories();

        absence.getAbsenceRepository().put(student,null);

        assertTrue("treeSet should be null", absence.getAbsenceRepository().get(student) == null);

        absence.addAbsenceDate(student, LocalDate.of(2015, 5, 10));
        assertFalse("treeSet should not be null", absence.getAbsenceRepository().get(student) == null);

        assertTrue("should be equal", student.eguals(new Student("Kamil","Kowalski")));

        assertTrue("key should be included", absence.getAbsenceRepository().containsKey(new Student("Kamil", "Kowalski")));

        assertTrue("result should not be null", absence.getAbsenceDates(new Student("Kamil", "Kowalski"))!=null);
    }
}