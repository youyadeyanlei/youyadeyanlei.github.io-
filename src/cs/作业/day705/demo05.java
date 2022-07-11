package cs.作业.day705;

public class demo05 {
    public static void main(String[] args) {
        System.out.println(xiao(-1));
        System.out.println(xiao(-0.8));
        System.out.println(xiao(8));

    }
    public static double xiao(double a){
        double b=0;
        if (a<0){
            a=b-a;
        }
        return  a;

    }
}
