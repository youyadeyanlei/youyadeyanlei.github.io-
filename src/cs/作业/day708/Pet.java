package cs.作业.day708;

public class Pet {
    String nickname;
    int age;
    String sex;
    String breed;
    public void show(){
        System.out.println("昵称"+nickname+"年龄"+age+"性别"+sex+"品种"+breed);
    }
    public void eat(){
        System.out.println("吃");
    }

    public static void main(String[] args) {
        Pet dog=new Pet();
        dog.nickname="泰迪";
        dog.age=3;
        dog.sex="母";
        dog.breed="狗";
        dog.show();
        dog.eat();
    }
}
