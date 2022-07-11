package cs.作业.day706;

public class demo01 {
    public static void main(String[] args) {

        int[] a=new int[6];
       qian(a);

        int[] a1={11,22,33};
     // qian(a1);
        cha(0,99,a1);


    }
    public static void cha(int c,int b,int a1[]){
        int[] number=new int[a1.length*2];
        for (int i = 0; i < a1.length ; i++) {
            number[i]=a1[i];
        }
        a1=number;
        System.out.println(a1.length);

        int[] a2=new int[a1.length+1];
        for (int i = 1; i < a1.length ; i++) {
            a2[i]=a1[i-1];
        }
        a1=a2;
        a1[c]=b;
        System.out.println(a1.length);
        for (int s:a1
             ) {
            System.out.println(s);
        }


    }
    public static int[] qian(int a1[]){
        int[] number=new int[a1.length*2];
        for (int i = 0; i < a1.length ; i++) {
            number[i]=a1[i];
        }
        a1=number;
        System.out.println(a1.length);
return a1;
    }
//    public static void shu(int a[]){
//        int[] a1=new int[a.length*2];
//        for (int i = 0; i < a.length ; i++) {
//
//            a1[i]=a[i];
//        }
//        a=a1;
//        System.out.println("kuo");
//         int b=a.length;
//        System.out.println(b);
//    }


}
