package main.task3.service;

import java.util.Comparator;
import main.task2.*;
public class DisplayStudentsAlphabetically {

    private University university;

    public University getUniversity() {
        return university;
    }

    public void setUniversity(final University university) {
        this.university = university;
    }

    public DisplayStudentsAlphabetically( final University university) {
        this.university = university;
    }

    public void displayStudentsAlphabetically(final Group group){
        System.out.println("Виведення студентів в алфавітному порядку групи "+group.getNameGroup()+" \n");

        group.getStudents().sort(Comparator.comparing(Student::getFullName));

        for (final Student i :group.getStudents()) {
            System.out.println(i.getFullName());
        }
    }
}
