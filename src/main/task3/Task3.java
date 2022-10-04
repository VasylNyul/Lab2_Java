package main.task3;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import main.task2.*;
import main.task3.service.*;

public class Task3 {
    public static void main(final String[] args) {
        final Subject subject1 = new Subject(5, "Прикладне програмування");
        final Subject subject2 = new Subject(4, "ТІМС");
        final Subject subject3 = new Subject(5, "Фіз. вих.");

        final List<Subject> list1 = new ArrayList<>();

        list1.add(subject1);
        list1.add(subject2);
        list1.add(subject3);

        final List<Subject> list2 = new ArrayList<>();
        list2.add(subject1);
        list2.add(subject2);
        list2.add(subject3);

        final Student student1 = new Student("Нюл Василь", "ОІТ", list1);
        final Student student2 = new Student("Тарасенко Петро", "ОІТ", list1);
        final Student student3 = new Student("Майк Тайсон", "ОІТ", list2);
        final Student student4 = new Student("Андрій Шевченко", "ОІТ", list2);

        final List<Student> list21 = new ArrayList<>();
        list21.add(student1);
        list21.add(student2);

        final List<Student> list22 = new ArrayList<>();
        list22.add(student3);
        list22.add(student4);

        final Schedule schedule1 = new Schedule();
        schedule1.addToTuesday(2, "ТІМС");
        schedule1.addToWednesday(2, "ТІМС");
        schedule1.addToWednesday(3, "Фіз. вих.");
        schedule1.addToWednesday(6, "Прикладне програмування");
        schedule1.addToThursday(1, "Прикладне програмування");
        schedule1.addToThursday(3, "Фіз. вих.");
        schedule1.addToFriday(1, "Прикладне програмування");
        //System.out.println(schedule1);

        final Group group1 = new Group("ІТ-22", list21, schedule1);
        final Group group2 = new Group("ІТ-21", list22, schedule1);

        final List<Group> list3 = new ArrayList<>();
        list3.add(group1);
        list3.add(group2);

        final University NULP = new University("НУЛП", list3);

        final Subject subject4 = new Subject("Системне програмування");

        final AddNewSubject addNewSubject = new AddNewSubject(NULP);
        addNewSubject.addNewSubject("ІТ-22", subject4);

        final OuTBySubject bmw = new OuTBySubject(NULP);
        bmw.outBySubject("Системне програмування");

        final OuTBySubject bmw1 = new OuTBySubject(NULP);
        bmw1.outBySubject("ТІМС");

        final DisplayStudentsAlphabetically display = new DisplayStudentsAlphabetically(NULP);

        display.displayStudentsAlphabetically(group2);

        final AddToSchedule addToSchedule1 = new AddToSchedule(NULP);

        addToSchedule1.getUniversity().getGroups().get(0).getSchedule().deleteAll();

        addToSchedule1.addToSchedule("ІТ-22", "Системне програмування", 1, LocalDate.of(2022,9,26));
        addToSchedule1.addToSchedule("ІТ-22", "Прикладне програмування", 2, LocalDate.of(2022,9,27));
        addToSchedule1.addToSchedule("ІТ-22", "ТІМС", 1, LocalDate.of(2022,9,28));
        addToSchedule1.addToSchedule("ІТ-22", "Фіз. вих.", 4, LocalDate.of(2022,9,29));
        addToSchedule1.addToSchedule("ІТ-22", "Системне програмування", 2, LocalDate.of(2022,9,30));

        System.out.println(addToSchedule1.getUniversity().getGroups().get(0).getSchedule());
    }
}
