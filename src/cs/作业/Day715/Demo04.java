package cs.作业.Day715;

public class Demo04 {
    public static void main(String[] args) {
        Factory factory = new Components1();
        Factory factory1 =new Components2();
        Workshop worker = new Workshop();
        worker.run(factory1);
        worker.run(factory);

    }
}

//工厂
abstract class Factory {
    private String name;

    abstract void make();//制造

    public Factory() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//零件1
class Components1 extends Factory {

    public Components1() {
        super.setName("零件1");

    }

    void make() {//制造
        System.out.println(this.getName());
    }
}

//零件2
class Components2 extends Factory {
    public Components2() {
        super.setName("零件2");

    }

    void make() {//制造
        System.out.println(this.getName());
    }
}

//制造车间
class Workshop {
    private Factory factory;

    public static void run(Factory factory) {
        factory.make();
    }
}