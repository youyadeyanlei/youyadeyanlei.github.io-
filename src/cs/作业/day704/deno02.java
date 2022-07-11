package cs.作业.day704;

public class deno02 {
    public static void main(String[] args) {
        double i=0.1D;
        System.out.println(i);
        int b=0;
        final double ZH=8848860;
//        while (i<=ZH){
//            i=i*2;
//            b++;
//            System.out.println(i);
//        }
//        System.out.println(i);
//        System.out.println(b);

        for (int j = 0; i <ZH ; j++) {
            i=i*2;
            b++;

        }
        System.out.println(b);


    }
}
