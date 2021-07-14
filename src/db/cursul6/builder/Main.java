package db.cursul6.builder;

public class Main {
    public static void main(String[] args) {
        Car c = new Car.CarBuilder().withAge(12).withAge2(11).withColor("red").withDoors(5).withEngine("eng 1998").build();
        System.out.println(c);

//        Car.CarBuilder b1 =  new Car.CarBuilder();
//        Car.CarBuilder b2 = b1.withAge(12);
//        Car.CarBuilder b3 = b1.withAge2(12);
//        System.out.println(b1.build());
//
//        Car.CarBuilder bb =  new Car.CarBuilder();
//        bb.withAge(12);
//        bb.withAge2(12);
//        System.out.println(bb.build());
    }
}
