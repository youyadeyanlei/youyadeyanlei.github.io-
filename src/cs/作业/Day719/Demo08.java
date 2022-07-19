package cs.作业.Day719;

public class Demo08 {
    public static void main(String[] args) {
    Animal11 animal11=new Dog();
    Animal11 animal111=new Animal11();
        System.out.println(animal11 instanceof Animal11);
        System.out.println(animal111 instanceof Animal11);
        System.out.println(animal11.getClass()==animal111.getClass());
    }
}
class Animal11{
}
class Dog extends Animal11{

}