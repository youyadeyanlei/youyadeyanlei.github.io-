package cs.作业.Day718.lianx;

public class Pingpangcoach extends Coach implements English {
    public Pingpangcoach() {
    }

    public Pingpangcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教学");
    }

    @Override
    public void speakEnglish() {

        System.out.println("乒乓球教练在说英语");
    }
}
