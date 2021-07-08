package db.cursul3.customList;

public class List {
    private Node head;

    public void add(String s) {
        if (head == null) {
            head = new Node(s);
        } else {
            Node p = head;

            while (p.getNext() != null) {
                p = p.getNext();
            }

            p.setNext(new Node(s));
        }
    }

    public void print() {
        Node p = head;

        while (p != null) {
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }

}
