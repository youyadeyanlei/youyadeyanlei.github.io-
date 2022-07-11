package cs.作业.day702;

public class demo02 {
    public static void main(String[] args) {
        int a=2019;
        for (int i = 1; i >0 ; i++) {
            a=2019-12*i;
            if (a>=1949){
                System.out.println(a);
            }
            if (a<1949){
                break;
            }
        }
    }
}
