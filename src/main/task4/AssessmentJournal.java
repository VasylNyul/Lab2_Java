package main.task4;

import main.task2.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AssessmentJournal {
    private final University university;
    private final Student student;
    private final Map<String, Integer> grades = new TreeMap<>();

    public AssessmentJournal(final University university, final Student student) {
        this.university = university;
        this.student = student;

        Student temp = new Student();
        for (final Group i : university.getGroups()) {
            for (final Student j : i.getStudents()) {
                if (j.equals(student)) {
                    temp = j;
                }
            }
        }
        for (final Subject i : temp.getSubjects()) {
            grades.put(i.getNameSubject(), i.getGrade());
        }
    }

    public void deleteGrade(final String subject) {
        for(final Map.Entry<String, Integer> record : grades.entrySet()) {
            if (record.getKey().equals(subject)) {
                record.setValue(null);
            }
        }
    }

    public void addGrade(final String subject, final int grade) {
        grades.put(subject, grade);
    }

    public void changeGrade(final String subject, final int grade) {
        for(final Map.Entry<String, Integer> record : grades.entrySet()) {
            if (record.getKey().equals(subject)) {
                grades.put(subject, grade);
            }
        }
    }

    public void studentGrades() {
        System.out.println("Оцінки студента :" + student.getFullName() + "\n" );
        for(final Map.Entry<String, Integer> record : grades.entrySet()) {
            System.out.println("  Предмет: "+record.getKey()+ " - "+record.getValue());
        }
    }

    public void displayAllGradesBySubject(final String subject) {
        System.out.println("Оцінки студентів з предмету: " + subject +"\n");
        for(final Group i: university.getGroups()){
            for (final Student j: i.getStudents()) {
                for (final Subject k: j.getSubjects()) {
                    if (k.getNameSubject().equals(subject)) {
                        System.out.println("\t" + j.getFullName() + " - " + k.getGrade());
                    }

                }
            }
        }
    }

    public void AllGradesOfAllStudents() {
        System.out.println("Оцінки всіх студентів університету "+ university.getNameUniversity()+"\n\n");
        final List<AssessmentJournal> assessmentJournalList = new ArrayList<>();
        for(final Group i: university.getGroups()){
            for(final Student j: i.getStudents()) {
                assessmentJournalList.add(new AssessmentJournal(university, j));
            }
        }
        for (final AssessmentJournal i : assessmentJournalList) {
            i.studentGrades();
            System.out.println();
        }
    }

}
