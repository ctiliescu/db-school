package db.cursurul2;

public class Main {
    public static void main(String[] args) {
        Shape patrat = new Shape("patrat");
        Shape nuj = new Shape();
        System.out.println(patrat.getCount());
        System.out.println(Shape.getCount());

        patrat.draw();
        nuj.draw();
    }
}
