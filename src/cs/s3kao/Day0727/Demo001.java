package cs.s3kao.Day0727;

public class Demo001 {
    public static final  int RE=0x1;
    public static final int RA=0x2;
    public static final int RB=0x3;
    public int color;
    public void  test() {
        color= RE;
        color=4;
    }

    public  Color colorEEcolor;
    public void test1() {
        colorEEcolor =Color.RB;
        System.out.println(colorEEcolor);
        System.out.println(colorEEcolor.name());
        System.out.println(colorEEcolor.ordinal());
        System.out.println(colorEEcolor.toString());
    }

    public static void main(String[] args) {
        Demo001 demo001 =new Demo001();
        demo001.test1();
    }
}
