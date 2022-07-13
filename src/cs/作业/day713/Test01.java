package cs.作业.day713;

public class Test01 {
    void test(){
        System.out.println("测试1");
    }
    void test(String name){
        System.out.println("测试2");
    }
    void test(String name,int age){
        System.out.println("测试3");
    }
    void test(double n){
        System.out.println("测试4");
    }
    public static void main(String[] args) {
        Demo05 demo05=new Demo05();
        demo05.name="b";
        demo05.name1="b1";
       // demo05.name2="b2";报错，显示name2是私有的不能直接赋值
        demo05.setName("a");
        demo05.setName1("a1");
        demo05.setName2("a2");//通过set方法可以给私有的name2赋值
        System.out.println(demo05.getName());//通过get方法获取值
    }
}
