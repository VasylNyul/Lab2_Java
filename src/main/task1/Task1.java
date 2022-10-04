package main.task1;

public class Task1 {
    public static void main(final String[] args) {

        final IterableLinkedList link = new IterableLinkedList();

        link.add ("Локомотив");
        link.add ("Автомобіль 1");
        link.add ("Автомобіль 2");
        link.add ("хвіст карети");

        for(final Object data : link) {
            System.out.println(data);
        }
        link.clear();
        System.out.println();
        for(final Object data : link) {
            System.out.println(data);
        }
    }
}