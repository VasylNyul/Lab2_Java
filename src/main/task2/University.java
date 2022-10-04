package main.task2;

import java.util.List;

public class University {
    private String nameUniversity;
    private List<Group> groups;

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(final String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(final List<Group> groups) {
        this.groups = groups;
    }

    public University(final String nameUniversity, final List<Group> groups) {
        this.nameUniversity = nameUniversity;
        this.groups = groups;
    }

    @Override
    public String toString() {
        final StringBuilder result=new StringBuilder("Інформація про : "+nameUniversity+":\n");
        for (final Group i: groups) {
            result.append(i);
        }
        return result.toString();
    }
}
