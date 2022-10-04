package main.task1;

public class LinkedList implements Queue{
    protected Node first;
    private Node last;

    public LinkedList(final Node first) {
        this.first = first;
    }

    public LinkedList() {
    }

    @Override
    public void add(final Object data){
        final Node temp = first;
        final Node newNode = new Node(temp,data,null);
        newNode.next = null;
        if(last != null){
            last.next = newNode;
        }
        newNode.prev = last;
        last = newNode;
        if (first == null){
            first = newNode;
        }
    }

    @Override
    public int size(){
        int size = 0;

        if (first == null){
            return size;
        }

        Node headPointer = first;

        while (headPointer != null){
            ++size;
            headPointer = headPointer.getNext();
        }

        return size;
    }

    @Override
    public Object get(){
        final Node headPointer = first;

        if (first == null){
            return 0;
        }

        if(headPointer.getNext() != null){
            first = first.getNext();
        }

        return headPointer.getData();
    }


    @Override
    public void delete(final int index) {

        if(index==-1) {
            System.out.println("Error");;
        }
        Node div = this.first;
        for(int i=0;i<index;i++) {
            div = div.next;
        }
        if(div==this.first) {
            if(div==this.last) {
                this.first = this.last=null;
            }else {
                Node tmp = this.first;
                this.first = tmp.next;
                this.first.prev = null;
                tmp.next = null;
                tmp = null;
            }
        } else if(div==this.last) {
            Node tmp = this.last;
            this.last = tmp.prev;
            this.last.next = null;
            tmp.prev = null;
            tmp = null;
        }else {
            div.prev.next=div.next;
            div.next.prev=div.prev;
            div.prev=null;
            div.next=null;
        }
    }

    @Override
    public void clear() {
        for(Node temp = first; temp!=null;){
            temp.data = null;
            final Node node = temp.next;
            temp = temp.next = temp.prev = null;
            temp = node;
        }
    }
}
