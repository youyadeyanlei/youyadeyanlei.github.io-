package cs.s3kao.s3;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
      //  Teacher[] teacher = new Teacher[10];
     List<Teacher> list=new ArrayList<>();
         list.add( new Teacher("a",18,2000));
        list.add(new Teacher("b",10,2333));
        list.add(new Teacher("c",55,5000));
        list.add( new Teacher("a1",18,2100));
//        sort(list);

        Collections.sort(list);


      //  Collections.sort(list, list.get(i).getAge());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Teacher str = (Teacher) it.next();
        //    System.out.println("姓名"+str.getName()+"年龄"+str.getAge()+"工资"+str.getSalary());
            System.out.println(str.toString());
        }

    }

    static  void  sort(List<Teacher> list){
      int[]  listage=new int[list.size()];
          int b=0;
        List<Teacher> list1=new ArrayList<>();
        list1.add(b,list.get(0));
      for (int i = 1; i < listage.length; i++) {
          if (list.get(b).getAge()>list.get(i).getAge()){
              

          }
      }

    }


}

class Teacher implements Comparable{
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Teacher() {
    }

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
//    public int compareTo(Object o) {
//        Teacher that = (Teacher) o;
//        if (this.getAge()== that.getAge()) {
//            return (int) (this.getSalary()-that.getSalary());
//        }
//        return this.getAge() - that.getAge();
//    }

    public int compareTo(Object o) {
        Teacher that = (Teacher) o;
        if (this.getAge()== that.getAge()) {
            return (int) (that.getSalary()-this.getSalary());
        }
        return  that.getAge()-this.getAge();
    }
}