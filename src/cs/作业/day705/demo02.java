package cs.作业.day705;

public class demo02 {
    public static void main(String[] args) {
       // size(5,6);
      double b=  size1(7,6,4);
        System.out.println(b);

    }
    public static void size(double a,double b){
        if (a>b){
            System.out.println(a);
        }else if (a<b)
        {
            System.out.println(b);
        }else System.out.println("一样大"+a);
    }
    public static double size1(double a,double b,double c){
//        if (a>b){
//            if (a>c){
//                System.out.println(a);
//            }else System.out.println(c);
//        }else if (b>c){
//            System.out.println(b);
//        }else System.out.println(c);
        double d=(a>b)?a:b;
        double d1=(a>c)?a:c;
        double d2=(d>d1)?d:d1;

        return d2;
    }
}
