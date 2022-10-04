package main.task1;

import java.util.Iterator;

public class IterableLinkedList extends LinkedList implements Iterable<Object>{
    public IterableLinkedList() {}

    @Override
    public Iterator<Object> iterator() {
        return new LinkedListIterator();
    }
    private class LinkedListIterator  implements Iterator<Object> {
        Node next = first;

        @Override
        public boolean hasNext() { return next != null; }

        @Override
        public Object next() {
            final Object data = next.getData();
            next = next.getNext();
            return data;
        }
    }
}
