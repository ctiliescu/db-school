package db.cursul6.builder;

public class Car {
    private final String color;
    private final String model;
    private final String manufacture;
    private final String engine;
    private final int km;
    private final int age;
    private final int doors;
    private final String color2;
    private final String model2;
    private final String manufacture2;
    private final String engine2;
    private final int km2;
    private final int age2;
    private final int doors2;

    public Car(CarBuilder b) {
        this.color = b.color;
        this.model = b.model;
        this.manufacture = b.manufacture;
        this.engine = b.engine;
        this.km = b.km;
        this.age = b.age;
        this.doors = b.doors;
        this.color2 = b.color2;
        this.model2 = b.model2;
        this.manufacture2 = b.manufacture2;
        this.engine2 = b.engine2;
        this.km2 = b.km2;
        this.age2 = b.age2;
        this.doors2 = b.doors2;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getEngine() {
        return engine;
    }

    public int getKm() {
        return km;
    }

    public int getAge() {
        return age;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor2() {
        return color2;
    }

    public String getModel2() {
        return model2;
    }

    public String getManufacture2() {
        return manufacture2;
    }

    public String getEngine2() {
        return engine2;
    }

    public int getKm2() {
        return km2;
    }

    public int getAge2() {
        return age2;
    }

    public int getDoors2() {
        return doors2;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", engine='" + engine + '\'' +
                ", km=" + km +
                ", age=" + age +
                ", doors=" + doors +
                ", color2='" + color2 + '\'' +
                ", model2='" + model2 + '\'' +
                ", manufacture2='" + manufacture2 + '\'' +
                ", engine2='" + engine2 + '\'' +
                ", km2=" + km2 +
                ", age2=" + age2 +
                ", doors2=" + doors2 +
                '}';
    }

    public static class CarBuilder {
        private String color;
        private String model;
        private String manufacture;
        private String engine;
        private int km;
        private int age;
        private int doors;
        private String color2;
        private String model2;
        private String manufacture2;
        private String engine2;
        private int km2;
        private int age2;
        private int doors2;

        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder withManufacture(String manufacture) {
            this.manufacture = manufacture;
            return this;
        }

        public CarBuilder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder withKm(int km) {
            this.km = km;
            return this;
        }

        public CarBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public CarBuilder withDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public CarBuilder withColor2(String color2) {
            this.color2 = color2;
            return this;
        }

        public CarBuilder withModel2(String model2) {
            this.model2 = model2;
            return this;
        }

        public CarBuilder withManufacture2(String manufacture2) {
            this.manufacture2 = manufacture2;
            return this;
        }

        public CarBuilder withEngine2(String engine2) {
            this.engine2 = engine2;
            return this;
        }

        public CarBuilder withKm2(int km2) {
            this.km2 = km2;
            return this;
        }

        public CarBuilder withAge2(int age2) {
            this.age2 = age2;
            return this;
        }

        public CarBuilder withDoors2(int doors2) {
            this.doors2 = doors2;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
