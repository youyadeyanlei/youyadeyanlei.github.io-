package cs.作业.day712;

public class Demo05 {
    int value;
   public Demo05(){

   }
    public Demo05(int value) {
       this.value=value;
    }


    public static void main(String[] args) {
        Demo05 demo05=new Demo05();
        Demo05 demo051=new Demo05(10);
        System.out.println(demo05.value);
        System.out.println(demo051.value);
    }
}
