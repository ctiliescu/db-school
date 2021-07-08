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
    public void recursiveAdd(String s){
        if(head == null){
            head = new Node(s);
        } else {
            head.add(s);

        }
    }

    public void print() {
        Node p = head;

        while (p != null) {
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }

    public void add(int pos, String s) throws AddException {
        if (pos < 0 || (head == null && pos > 0)) {
            throw new AddException();
        } else {
            if (pos == 1) {
                head.setNext(new Node(s, head.getNext()));
            } else if (pos == 0) {
                head = new Node(s, head);
            } else {
                head.add(pos - 1 ,s);
            }
        }
    }
}
