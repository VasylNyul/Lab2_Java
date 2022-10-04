package main.task2;

import java.util.List;

public class Student {
    private String fullName;
    private String speciality;
    private List<Subject> subjects;

    public Student(final String fullName, final String speciality, final List<Subject> subjects) {
        this.fullName = fullName;
        this.speciality = speciality;
        this.subjects = subjects;
    }

    public Student(){}
    public String getFullName() {
        return fullName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public void setSpeciality(final String speciality) {
        this.speciality = speciality;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder("Інформація про студента: \n");
        result.append("\tІм'я: "+fullName+"\n")
                .append("\tСпеціальність: "+ speciality +"\n")
                .append("\tПредмети:\n");

        for (final Subject i: subjects) {
            result.append("\t"+i.getNameSubject() +" - "+i.getGrade()+"\n");
        }
        return result.toString();
    }

}
