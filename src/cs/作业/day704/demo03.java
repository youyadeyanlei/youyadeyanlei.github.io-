package cs.作业.day704;

public class demo03 {
    public static void main(String[] args) {
        int sum=0;
        for (int j = 0; j <=100 ; j++) {
            sum=sum+j;
        }
        System.out.println(sum);

        int sum1=0;
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){
                sum1=i+sum1;
            }
        }
        System.out.println(sum1);

        int d=1;
        for (int i = 1; i <=10; i++) {
            d=i*d;
        }
        System.out.println(d);
//        int v=1*2*3*4*5*6*7*8*9*10;
//        System.out.println(v);
        int run=0;
        for (int i = 1500; i <=2021 ; i++) {
            if (i%4==0&&i%100!=0){
                System.out.println(i);
            }
        }
    }
}
