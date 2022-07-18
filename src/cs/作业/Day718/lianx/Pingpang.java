package cs.作业.Day718.lianx;

public class Pingpang extends Sporter implements English {
    public Pingpang() {
    }

    public Pingpang(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }

    @Override
    public void study() {

        System.out.println("乒乓球运动员在学习打乒乓球");
    }
}
