package main.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Task2 {
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
        System.out.println(schedule1);

        final Group group1 = new Group("ІТ-22", list21, schedule1);
        final Group group2 = new Group("ІТ-21", list22, schedule1);

        final List<Group> list3 = new ArrayList<>();
        list3.add(group1);
        list3.add(group2);

        final University NULP = new University("НУЛП", list3);

        System.out.println(NULP);
    }
}
