package school.repository;

import school.model.Student;

import java.util.ArrayList;

/**
 * Created by michal on 25.05.15.
 */
public interface AbsenceService {
    //adding abbsence days to repository
    void addAbsence (AbsenceService absenceRepository);

    ArrayList findAbsenceDates(Student studentName);


    //finding st
}
