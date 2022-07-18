package cs.作业.Day718.lianx;

import cs.作业.Day718.lianx.Coach;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {

        System.out.println("篮球教练教学");
    }
}
