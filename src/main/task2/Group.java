package main.task2;

import java.util.List;

public class Group {
    private String nameGroup;
    private List<Student> students;

    private Schedule schedule;

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(final String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(final Schedule schedule) {
        this.schedule = schedule;
    }

    public Group(final String nameGroup, final List<Student> students, final Schedule schedule) {
        this.nameGroup = nameGroup;
        this.students = students;
        this.schedule = schedule;
    }

    public Group(final String nameGroup) {
        this.nameGroup = nameGroup;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder("Група "+nameGroup+":\n");
        for (final Student i: students) {
            result.append("\t"+i.getFullName()+"\n");
        }
        return result.toString();
    }
}
