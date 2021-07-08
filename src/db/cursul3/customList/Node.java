package db.cursul3.customList;

public class Node {
    private String value;
    private Node next;

    public Node(String value) {
        this.value = value;
    }

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
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
        } else {
            next = new Node(s);
        }
    }

    public void add(int pos, String s) throws AddException {
        if (pos == 0) {
            next = new Node(s, next);
        } else {
            if (next == null) {
                throw new AddException();
            } else {
                next.add(pos - 1, s);
            }
        }
    }
}
