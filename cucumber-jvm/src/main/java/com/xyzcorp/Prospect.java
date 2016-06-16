package com.xyzcorp;


import java.time.LocalDate;

public class Prospect {

    private int birthYear;
    private int currentYear;

    public void setBirthDate(int year, int month, int day) {
       this.birthYear = year;
    }

    public void setCurrentDate(int year, int month, int day) {
       this.currentYear = year;
    }

    public int getRisk() {
        int result = currentYear - birthYear;
        if (result > 30 && result <= 40) {
            return 2;
        } else return 1;
    }
}
