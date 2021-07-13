package db.cursul3.customList;

public class List {
    private Node head;
    private int size;

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
        ++size;
    }
    public void recursiveAdd(String s){
        if(head == null){
            head = new Node(s);
            ++size;
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
        if (pos < 0 || size + 1 < pos) {
            throw new AddException();
        } else {
            if (pos == 0) {
                Node dummy = new Node(s, null);
                dummy.setNext(head);
                head = dummy;
                ++size;
            } else {
                head.add(pos - 1 ,s);
            }
        }
    }
}
