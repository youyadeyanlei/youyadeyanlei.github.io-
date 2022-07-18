package cs.作业.Day718.lianx;

public class Test {
    public static void main(String[] args) {

        Pingpangcoach pingpangcoach=new Pingpangcoach("魔王",22);
        Basketball basketball=new Basketball();
        basketball.setAge(22);
        basketball.setName("ww");
        pingpangcoach.speakEnglish();
        pingpangcoach.teach();
        basketball.study();
        System.out.println(pingpangcoach.getName()+pingpangcoach.getAge());

    }
}
