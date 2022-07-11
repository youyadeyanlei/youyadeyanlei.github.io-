package cs.作业.day711;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

      P();
    }

    /**
     *
     * @return
     */
    public static double P(){
        Scanner scanner=new Scanner(System.in);
        double P=0;
        double i=0;
        int n=0;
        double M=0;
        boolean falg=true;
        while (falg==true){
            System.out.println("输入贷款金额");
            P=scanner.nextDouble();
            if (P<1000||P>1000000){
                System.out.println("输入金额错误");
            }else falg=false;
        }
        boolean falg1=true;
        while (falg1==true){
            System.out.println("输入贷款利率");
            i=scanner.nextDouble();
            if (i<1||i>5){
                System.out.println("输入贷款利率错误");
            }else falg1=false;
        }
        boolean falg2=true;
        while (falg2==true){
            System.out.println("输入贷款时长");
            n=scanner.nextInt();
            if (n<1||n>30){
                System.out.println("输入时长错误");
            }else falg2=false;
        }
        M =take(P,n,i);
        System.out.println(M);
        return M;
    }
//    public static double take1(double p,double i,int n){
//        double sum=1;
//        int l=1;
//        for (int j = 0; j <n ; j++) {
//            sum=(1+i)*sum;
//        }
//
//    }
    /**
     *
     * @param p 贷款金额
     * @param n 贷款多少个月
     * @param i 月利息
     * @return 还款金额
     */
    public static  double take(double p,int n,double i){
        double sum=1;
        for (int j = 0; j <n ; j++) {
            sum=(i+1)*sum;
        }
        sum=p*i*sum/(sum-1);
        return sum;
    }//乘

}
