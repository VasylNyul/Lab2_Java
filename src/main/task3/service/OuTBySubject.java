package main.task3.service;

import main.task2.*;
public class OuTBySubject {
    private University university;

    public University getUniversity() {
        return university;
    }

    public void setUniversity(final University university) {
        this.university = university;
    }

    public OuTBySubject(final University university) { this.university = university; }

    public void outBySubject(final String subject) {
        System.out.println("Студенти які відвідують " + subject + " :");
        for (final Group i : university.getGroups()) {
            for (final Student j : i.getStudents()) {
                for (final Subject k : j.getSubjects()) {
                    if (subject.equals(k.getNameSubject())) {
                        System.out.println(j.getFullName());
                    }
                }
            }
        }
    }
}
