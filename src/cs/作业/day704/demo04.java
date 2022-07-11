package cs.作业.day704;

public class demo04 {
    public static void main(String[] args) {
        /*

         */
        for (int i = 0; i <1000 ; i++) {
            if (i%7==0){
                System.out.println(i);
            }
            if(i%10==7&&i/10==7){
                System.out.println(i);
            }
        }
        pao();
    }

    public static void pao(){
        final int a=5000;
        int b=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("第"+i+"圈");
            if (i==6){
                System.out.println("喝水"+i);
            }
        }
    }


}
