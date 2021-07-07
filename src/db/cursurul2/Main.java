package db.cursurul2;

public class Main {
    public static void main(String[] args) {
        Shape patrat = new Patrat(2);
        Shape dreptunghi = new Dreptunghi(2,3);
//        System.out.println(patrat.getCount());
//        System.out.println(Shape.getCount());
        System.out.println(patrat.getArea());
        System.out.println(dreptunghi.getArea());

        patrat.draw();
        dreptunghi.draw();
        System.out.println(((Patrat) patrat).getPerimetru());
//        patrat.get
    }
}
