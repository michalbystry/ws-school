package school.repository;

import org.springframework.stereotype.Repository;
import school.model.Student;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by michal on 24.05.15.
 */

@Repository
public class AbsenceRepositories implements AbsenceService {

    private static Map<Student, SortedSet<LocalDate>> absenceRepository = new HashMap<Student, SortedSet<LocalDate>>();

    public Map<Student, SortedSet<LocalDate>> getAbsenceRepository() {
        return absenceRepository;
    }

    public SortedSet<LocalDate> addAbsenceDate(Student student, LocalDate date) {
        SortedSet<LocalDate> absenceSet = absenceRepository.get(student);

        if (absenceSet != null) {
            absenceSet.add(date);
//            absenceRepository.put(student, absenceSet);
            return absenceRepository.get(student);
        } else {
            absenceSet = new TreeSet<LocalDate>();
            absenceSet.add(date);
            absenceRepository.put(student, absenceSet);
            return absenceRepository.get(student);
        }
    }

    @Override
    public boolean removeAbsenceDate(Student student, LocalDate date) {
        SortedSet<LocalDate> absenceSet = absenceRepository.get(student);

        if (absenceRepository.containsKey(student) && absenceSet != null) {
            return absenceSet.remove(date);
        };
        return false;
    }

    @Override
    public SortedSet<LocalDate> getAbsenceDates(Student student) {
//        return Collections.unmodifiableSortedSet(absenceRepository.get(student));
        return getAbsenceRepository().get(student);

        //        return Collections.unmodifiableSortedSet(absenceRepository.get(student));
        //        return (absenceRepository.get(student).!=null)? "null" :"not null";    }

    }

}






