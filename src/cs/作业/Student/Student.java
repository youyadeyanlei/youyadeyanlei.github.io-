package cs.作业.Student;

/**
 * 封装学员信息
 */
public class Student {

    private int sid;
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(int sid, String name, int age, String gender) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
}
