package main.task3.service;

import java.time.DayOfWeek;
import java.time.LocalDate;

import main.task2.*;

public class AddToSchedule {
    private University university;

    public University getUniversity() {
        return university;
    }

    public void setUniversity(final University university) {
        this.university = university;
    }

    public AddToSchedule(final University university) { this.university = university;}

    public void addToSchedule(final String group, final String subject, final int number, final LocalDate date) {
        final DayOfWeek dayOfWeek = date.getDayOfWeek();

        for (final Group i : university.getGroups()) {
            if (i.getNameGroup().equals(group)) {
                if (dayOfWeek.getValue() == 1) {
                    i.getSchedule().addToMonday(number, group + ", " + subject + ", " + date);
                }
                if (dayOfWeek.getValue() == 2) {
                    i.getSchedule().addToTuesday(number, group + ", " + subject + ", " + date);
                }
                if (dayOfWeek.getValue() == 3) {
                    i.getSchedule().addToWednesday(number, group + ", " + subject + ", " + date);
                }
                if (dayOfWeek.getValue() == 4) {
                    i.getSchedule().addToThursday(number, group + ", " + subject + ", " + date);
                }
                if (dayOfWeek.getValue() == 5) {
                    i.getSchedule().addToFriday(number, group + ", " + subject + ", " + date);
                }
            }
        }
    }
}