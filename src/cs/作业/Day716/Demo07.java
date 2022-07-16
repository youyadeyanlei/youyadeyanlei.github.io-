package cs.作业.Day716;

public class Demo07 {
    public static void main(String[] args) {
        Text07 text07=new Text07(10);
        final int a=1;
        text07.pr(a);
    }
}
class Text07{
    final int value;

 //   public Test07(){}
    public Text07(int value) {
        this.value = value;
    }
    public void pr(int i){
        i=i*2;
        System.out.println(i);
    }
}
