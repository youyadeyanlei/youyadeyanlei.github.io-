package cs.作业.Day719;

public class Demo11 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.menth(300);
        outer.menth(300);
    }
}
class Outer{
    private int a=100;
    private static int a1=200;
    public void menth(int a3){
        final int a4=400;
        class  Inter{
            public void print(){
                System.out.println(a);
                System.out.println(a1);
                System.out.println(a3);
                System.out.println(a4);
            }
        }
    }
}