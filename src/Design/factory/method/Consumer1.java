package Design.factory.method;

import Design.factory.simple.Car;
import Design.factory.simple.CarFactory;

public class Consumer1 {
    public static void main(String[] args) {
        Car1 car1 = new  TeslaFactoy1().getCar();
        car1.name();
    }
}
