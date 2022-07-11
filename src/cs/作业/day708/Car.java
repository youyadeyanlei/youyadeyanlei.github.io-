package cs.作业.day708;

public class Car {
    String color;
    String brand;
    String pice;

    public void run(){
        System.out.println("qianjing");
    }
    public void show(){
        System.out.println("hou");
    }
    public Car(int i) {
        System.out.println(i);
    }

    public Car() {

    }

    public Car(String name, int i) {

    }

    public static void main(String[] args) {
        Car c = new Car(1);


    }
}
