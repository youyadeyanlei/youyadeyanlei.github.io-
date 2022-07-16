package cs.作业.Day716.lainx;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" 吃骨头");
    }

    @Override
    public void swin() {
        System.out.println(this.getName()+"游泳");

    }
}
