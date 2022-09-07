package Design.factory.method;

import Design.factory.simple.Car;

public class TeslaFactoy1 implements CarFactory1 {

    @Override
    public Car1 getCar() {
        return new Tesila1();
    }
}
