package school.controller;

import javax.validation.constraints.NotNull;

/**
 * Created by michal on 30.05.15.
 */
public class SchoolDto {

    @NotNull
    private String studentName;
    @NotNull
    private String studentSurname;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }
}
