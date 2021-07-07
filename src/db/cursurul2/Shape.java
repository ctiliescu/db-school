package db.cursurul2;

public class Shape {
    private String name;
    private static int count = 0;

    public Shape() {
        this.name = "undefined";
        count++;
    }

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

    public int getArea() {
        return  0;
    }

    public static int getCount() {
        return count;
    }
}
