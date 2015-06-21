package school.controller;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created by michal on 17.06.15.
 */

public class SchoolDateDto {
    @NotNull
    private int day;
    @NotNull
    private int month;
    @NotNull
    private int year;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {

        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public SchoolDateDto(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public SchoolDateDto() {
    }
}