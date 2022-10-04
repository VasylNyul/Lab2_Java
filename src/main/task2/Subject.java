package main.task2;

public class Subject {
    private int grade;
    private String nameSubject;

    public int getGrade() {
        return grade;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setGrade(final int grade) {
        this.grade = grade;
    }

    public void setNameSubject(final String nameSubject) {
        this.nameSubject = nameSubject;

    }

    public Subject(final int grade, final String nameSubject) {
        this.grade = grade;
        this.nameSubject = nameSubject;
    }

    public Subject(final String nameSubject) {
        this.nameSubject = nameSubject;
    }

    @Override
    public String toString() {
        return  nameSubject;
    }
}
