package cs.作业.Day715;

class Meal {
    public Meal() {
        System.out.println("Meal");
    }
}
class  Lunch extends Meal{
    public Lunch() {
        System.out.println("Lunch");
    }
}
class Vegetable{
    public Vegetable() {
        System.out.println("vege");
    }
}
class Potato extends Vegetable{
    public Potato() {
        System.out.println("Po");
    }
}
class Tomato extends Vegetable{
    public Tomato() {
        System.out.println("TEm");
    }
}
class Meat{
    public Meat() {
        System.out.println("meat");
    }
}
class Sand extends Lunch{
    Potato potato=new Potato();
    Meat meat=new Meat();
    Tomato tomato=new Tomato();
    public Sand(){
        System.out.println("Sand");
    }
}
public class Teas{
    public static void main(String[] args) {
        Sand sand=new Sand();
    }
}
class a{
    private void a1(){}
}
class b extends a{
     void a1(int i){}
    public b(){}
    public b(String str){
     //   super(str);
    }
}