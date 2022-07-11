package cs.demo01;

public class demo05 {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        for (int i=100;i<1000;i++){
            a=i/100;
            b=i/10%10;
            c=i-a*100-b*10;
            if( (a*a*a+b*b*b+c*c*c)==i){
                System.out.println("水仙花数"+i);
            }
        }
    }
}
