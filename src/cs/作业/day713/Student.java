package cs.作业.day713;

public class Student {//封装一个学生类
    private String name;//私有的名字
    private int age;//封装类里面的属性应该都是私有的，不能暴露的。
    //提供set和get方法

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
        this.age = age;
    }
}
