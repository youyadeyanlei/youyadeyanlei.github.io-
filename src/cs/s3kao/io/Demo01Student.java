package cs.s3kao.io;

import java.io.Serializable;
import java.util.Random;

public class Demo01Student implements Comparable, Serializable {
    // 语文
    private int language;
    // 数学
    private int math;
    //英语
    private int English;

    private int id;

   private  int sum;

    @Override
    public String toString() {
        return "Demo01Student{" +
                ", id=" + id +
                ",language=" + language +
                ", math=" + math +
                ", English=" + English +

                ", sum=" + sum +
                '}';
    }

    public Demo01Student() {
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Demo01Student(int id,int language, int math, int english, int sum) {
        this.language = language;
        this.math = math;
        English = english;
        this.id = id;
        this.sum = math+english+language;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
