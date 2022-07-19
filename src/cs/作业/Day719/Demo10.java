package cs.作业.Day719;

public class Demo10 {
    private int age;
    private String name;

    public Demo10( String name,int age) {
        this.age = age;
        this.name = name;
    }

    public Demo10() {
    }

    @Override
    public String toString() {
        return "Demo10{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Demo10 demo10=new Demo10("ww",12);
        System.out.println(demo10+""+100);
        System.out.println(100+""+demo10);
        System.out.println(""+demo10+100);
        System.out.println(""+100+demo10);
    }
}
