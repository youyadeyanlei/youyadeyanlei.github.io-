package cs.作业.Day716.lainx;

public class Rabbit extends Animal{
    @Override
    public void eat() {
        System.out.println(this.getName()+"吃东西");
    }

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }
}
