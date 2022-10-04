package main.task2;

import java.util.TreeMap;

public class Schedule {
    private final TreeMap<Integer, String> monday = new TreeMap<Integer, String>();
    private final TreeMap<Integer, String> tuesday = new TreeMap<Integer, String>();
    private final TreeMap<Integer, String> wednesday = new TreeMap<Integer, String>();
    private final TreeMap<Integer, String> thursday = new TreeMap<Integer, String>();
    private final TreeMap<Integer, String> friday = new TreeMap<Integer, String>();

    public void addToMonday(final int number, final String subject) {
        monday.put(number, subject);
    }

    public void addToTuesday(final int number, final String subject) {
        tuesday.put(number, subject);
    }

    public void addToWednesday(final int number, final String subject) {
        wednesday.put(number, subject);
    }

    public void addToThursday(final int number, final String subject) {
        thursday.put(number, subject);
    }

    public void addToFriday(final int number, final String subject) {
        friday.put(number, subject);
    }


    public String Monday() {
        String result="Понеділок:\n";
        if (!monday.isEmpty()) {
            for (final int i : monday.keySet()) {
                result+=("\t" + i + "-" + monday.get(i)+"\n");
            }
        }
        return result;
    }

    public String Tuesday() {
        String result="Вівторок:\n";
        if (!tuesday.isEmpty()) {
            for (final int i : tuesday.keySet()) {
                result+=("\t" + i + "-" + tuesday.get(i)+"\n");
            }
        }
        return result;
    }

    public String Wednesday() {
        String result="Середа:\n";
        if (!wednesday.isEmpty()) {
            for (final int i : wednesday.keySet()) {
                result+=("\t" + i + "-" + wednesday.get(i)+"\n");
            }
        }
        return result;
    }

    public String Thursday() {
        String result="Четвер:\n";
        if (!thursday.isEmpty()) {
            for (final int i : thursday.keySet()) {
                result+=("\t" + i + "-" + thursday.get(i)+"\n");
            }
        }
        return result;
    }

    public String Friday() {
        String result="П'ятниця:\n";
        if (!friday.isEmpty()) {
            for (final int i : friday.keySet()) {
                result+=("\t" + i + "-" + friday.get(i)+"\n");
            }
        }
        return result;
    }

    public void deleteMonday() { monday.clear();}

    public void deleteTuesday() { tuesday.clear();}

    public void deleteWednesday() { wednesday.clear();}

    public void deleteThursday() { thursday.clear();}

    public void deleteFriday() { friday.clear();}


    public void deleteAll() {
        deleteMonday();
        deleteTuesday();
        deleteWednesday();
        deleteThursday();
        deleteFriday();

    }

    @Override
    public String toString() {
        final StringBuilder result= new StringBuilder("Розклад:\n");
        if(!monday.isEmpty()){
            result.append(Monday());
        }
        if(!tuesday.isEmpty()){
            result.append(Tuesday());
        }
        if(!wednesday.isEmpty()){
            result.append(Wednesday());
        }
        if(!thursday.isEmpty()){
            result.append(Thursday());
        }
        if(!friday.isEmpty()){
            result.append(Friday());
        }
        return result.toString();
    }
}