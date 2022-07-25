package cs.作业.Day722;

import java.util.Objects;

public class Worker {
    private int age;
    private String name;
    private double salary;

    public Worker() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Worker worker = (Worker) o;
        return age == worker.age && Double.compare(worker.salary, salary) == 0 && Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, salary);
    }

    public Worker(String name, int age, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
