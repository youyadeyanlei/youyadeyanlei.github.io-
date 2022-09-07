package Design.factory.simple;

public class Consumer {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("五菱");

        car.name();
    }
}
