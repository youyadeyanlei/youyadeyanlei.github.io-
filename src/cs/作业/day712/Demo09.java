package cs.作业.day712;

public class Demo09 {
    public void Student(){}
    int age;
    String name;
    void init(){
        age=10;
        name="limy";
    }
    public void Student(String name){
        this.init();
        this.name=name;
    }
    public void Student(String name, int age){
        this.init();
      //  this(name);
        this.age=age;
    }
}
