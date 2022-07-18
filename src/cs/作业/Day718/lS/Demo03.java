package cs.作业.Day718.lS;

public class Demo03 {
    public static void main(String[] args) {

        CC cc=new ClassE();

        System.out.println(cc instanceof aa);
        System.out.println(cc instanceof ClassE);
        BB bb=new ClassE();
        bb.a1();
        bb.mb();
        cc.cc();
        ClassE m=new ClassE();
        m.a1();
        m.mb();
        m.cc();
        m.md();

    }}
interface aa{
    void a1();
}
interface BB extends aa{
    void mb();
}
interface CC{
    void cc();

}
interface DD extends CC{
    void md();
}
