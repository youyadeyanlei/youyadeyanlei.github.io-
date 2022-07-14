package cs.作业.day712;

public class Worker {

    //
    Address addr;
    String name;
    int age;
    double salary;

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
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

    public Worker() {

    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void work() {
    }

    void work(int hours) {

    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        Address address=new Address();
        worker.setName("zhangsan");
        worker.setAge(25);
        worker.setSalary(2500);
//        worker.name = "zhangsan";
//        worker.age = 25;
//        worker.salary = 2500;
//         访问静态变量，直接用类名进行访问，不推荐用实例.变量名访问
//         System.out.println(Address.address);
        address.setAddress("北京市海定区清华园1号");
//        worker.addr.address = "北京市海定区清华园1号";
        address.setZipCode("100084");
//        worker.addr.zipCode = "100084";

        System.out.println(worker.getName()+ "\n年龄"+worker.getAge()+"\n工资"+ worker.getSalary());


//        abc.getXxx().getXyz()
    }
}
