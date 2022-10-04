package main.task1;

public class Node {

    protected Node prev;
    protected Object data;
    protected Node next;

    public Node getPrev() {
        return prev;
    }

    public void setPrev(final Node prev) {
        this.prev = prev;
    }

    public Object getData() {
        return data;
    }

    public void setData(final Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }

    public Node(final Node prev, final Object data, final Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}


