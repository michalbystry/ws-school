package school.repository;

import school.model.Student;

import java.util.Comparator;

/**
 * Created by michal on 29.05.15.
 */
public class StudentComparator implements Comparator<Student> {
    @Override
    /* TO DO sprawdzic jak moze byc wykorzystana metoda equals nadpisana */

    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareToIgnoreCase(o2.getSurname());
    }
}
