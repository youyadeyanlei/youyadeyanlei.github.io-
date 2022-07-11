package cs.作业.day705;

public class demo06 {
    public static void main(String[] args) {

//        int b=test(1,0);
//        System.out.println(b);
//        int c= test1(1);
//        System.out.println(c);
        int e =text2(1,20);
        System.out.println(e);
    }

    public static int test1(int a){
         if (a<5){

             a++;
            return test1(a)*(a-1);
        }else return a;

    }


    public static int test(int a,int sum){

        if (a>100){
            return sum;
        }

        sum+=a;
        a++;

        return test(a, sum);

    }
    public static int text2(int a,int b){
        if (b>2){
            return text2(a*2, b-3);
        }
        return a;
    }
}
