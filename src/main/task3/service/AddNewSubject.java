package main.task3.service;

import main.task2.*;
public class AddNewSubject {
    private University university;

    public University getUniversity() {
        return university;
    }

    public void setUniversity(final University university) {
        this.university = university;
    }

    public AddNewSubject(final University university) { this.university = university;}
    public void addNewSubject(final String group, final Subject newSubject){
        System.out.println("Новий предмет "+ newSubject.toString() +" додано групі "+ group +" \n");
        for (final Group i: university.getGroups()) {
            if (i.getNameGroup().equals(group)) {
                i.getStudents().get(0).getSubjects().add(newSubject);
            }
        }

    }
}