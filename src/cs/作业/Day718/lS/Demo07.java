package cs.作业.Day718.lS;

public class Demo07 {
    public static void main(String[] args) {
        Animal animal[]=new Animal[3];
        animal[0]=new Dog();
        animal[1]=new Cat();
        animal[2]=new Wolf();
        for (int i = 0; i <animal.length ; i++) {
            animal[i].eat();

        }
        Pet pet[]=new Pet[2];
        pet[0]=new Dog();
        pet[1]=new Cat();
        for (int i = 0; i < pet.length ; i++) {
            pet[i].play();
        }

    }
}
abstract class Animal{
    public abstract void eat();
}
interface Pet{
    void play();
}
class Dog extends Animal implements Pet{

    @Override
    public void eat() {
        System.out.println("Dog");
    }

    @Override
    public void play() {

        System.out.println("DOG1");
    }
}
class Cat extends Animal implements Pet{

    @Override
    public void eat() {
        System.out.println("cat");
    }

    @Override
    public void play() {
        System.out.println("Cat1");
    }
}
class Wolf extends Animal{

    @Override
    public void eat() {
        System.out.println("3");
    }
}
