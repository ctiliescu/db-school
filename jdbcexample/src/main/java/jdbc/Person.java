package jdbc;

public class Person {
    Integer id;
    String name;

    @Override
    public String toString() {
        return "jdbc.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
