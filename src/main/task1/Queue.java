package main.task1;

public interface Queue {
    void add(Object data);
    void delete(int index);
    int size();
    Object get();
    void clear();
}

