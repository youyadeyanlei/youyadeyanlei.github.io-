package cs.作业.day711;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("输入贷款金额");
        double p=scanner.nextDouble();
        System.out.println("输入贷款多少月");
        int n=scanner.nextInt();
        System.out.println("输入贷款利息");
        double i=scanner.nextDouble();
        Demo01 take=new Demo01();
        double M=take.take(p,n,i);
        System.out.println("还款金额"+M);
    }

    /**
     *
     * @param p 贷款金额
     * @param n 贷款多少个月
     * @param i 月利息
     * @return 还款金额
     */
    public double take(double p,int n,double i){
        double sum=1;
    for (int j = 0; j <n ; j++) {
        sum=(i+1)*sum;
    }
    sum=p*i*sum/(sum-1);
        return sum;
}//乘


}
