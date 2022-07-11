package cs.作业.day701;

public class demo02 {
    public static void main(String[] args) {
      double  takeout01=0; //外卖
        double takeout02=0;
        takeout01=24+8+3;
        System.out.println(takeout01);
        takeout02=16+8+3;
        System.out.println(takeout02);
        takeout01=(takeout01>30)?takeout01*0.8:takeout01;
        System.out.println(takeout01);
        double min=(takeout01<takeout02)?takeout01:takeout02;
        System.out.println(min+"最小");
    }
}
