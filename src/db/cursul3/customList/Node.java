package db.cursul3.customList;

public class Node {
    private String value;
    private Node next;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void add(String s){
        if(next != null){
            next.add(s);
        }else {
            next = new Node(s);
        }
    }
}
