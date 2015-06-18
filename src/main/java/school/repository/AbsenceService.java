package school.repository;

import school.model.Student;
import java.time.LocalDate;
import java.util.Map;
import java.util.SortedSet;

/**
 * Created by michal on 25.05.15.
 */
public interface AbsenceService {

    public SortedSet<LocalDate> addAbsenceDate(Student student, LocalDate date);

    public boolean removeAbsenceDate(Student student, LocalDate date);

    public SortedSet<LocalDate> getAbsenceDates(Student student);

    public Map<Student, SortedSet<LocalDate>> getAbsenceRepository();
}
