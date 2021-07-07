package db.cursurul2;

public abstract class Shape {
    private String name;
    private static int count = 0;

    public Shape(String name) {
        this.name = name;
        count++;
    }

    public void draw() {
        System.out.println("Draw the shape " + name);
    }

    public String getName() {
        return name;
    }

    public abstract int getArea();

    public static int getCount() {
        return count;
    }
}
