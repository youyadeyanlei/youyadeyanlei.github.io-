package cs.作业.day709;

public class demo001{
    public static void main(String[] args) {
        demo01 q=new demo01();
        q.setName("xx");
        q.setAge(30);
        q.setSalary(20000);
        System.out.println(q.sa());
    }
}
class demo01 {

    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0&&age<120){
            this.age=age;
        }else {
            System.out.println("buheilei");
            this.age=18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String sa(){
        return name+age+salary;
    }
}
