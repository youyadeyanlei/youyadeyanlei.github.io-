package cs.作业.Day718.lianx;

import cs.作业.Day718.lianx.Person;

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
