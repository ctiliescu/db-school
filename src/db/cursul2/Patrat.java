package db.cursul2;

public class Patrat extends Shape {
    private int l;

    public Patrat(int lat) {
        super("Patrat");
        this.l=lat;
    }

    @Override
    public int getArea() {
        return l*l;
    }

    public int getPerimetru() {
        return 4 * l;
    }
}
