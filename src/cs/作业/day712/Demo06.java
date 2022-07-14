package cs.作业.day712;

public class Demo06 {

}
class Dog{
    String name;
    int age;
    boolean sexual;
    //true 表示公 ，false表示母
    public Dog(){

    }
    public Dog(String name,int age,boolean sexual){
        this.name=name;
        this.age=age;
        this.sexual=sexual;
    }
    public void play(){
        System.out.println(name+"play");
    }
    public void play(int n){
        System.out.println(name+"play"+n+"minutes");
    }

}
class  TestDog{
    public static void main(String[] args) {

        Dog d;
        Dog dog=new Dog();
        dog.name="joy";
        dog.age=2;
        dog.sexual=false;
        dog.play();
        dog.play(30);
    }
}
