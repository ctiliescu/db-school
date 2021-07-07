package db.cursurul2;

public class Dreptunghi extends Shape{
    private int l;
    private int L;

    public Dreptunghi(int L,int l) {
        super("Dreptunghi");
        this.L=L;
        this.l=l;
    }


    @Override
    public int getArea() {
        return L*l;
    }

    @Override
    public void draw() {
        System.out.println("Draw dreptunghi with L: " + L + " and l: " + l);
    }
}
