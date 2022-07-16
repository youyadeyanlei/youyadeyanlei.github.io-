package cs.作业.Day716;

public class Demo09 {
    public static void main(String[] args) {

        SAS sas=new SAS();
        sas.m1();
        sas.m1(10);
        sas.m1(1.5);
    }
}
class Super01{
    public final void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }

}
class SAS extends Super01{
    public void m1(int i){
        System.out.println("s");
    }
    public void m1(double b){
        System.out.println("ss");
    }
}
