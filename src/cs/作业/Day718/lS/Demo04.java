package cs.作业.Day718.lS;

public class Demo04 {
    public static void main(String[] args) {

        AA1 aa1=new BA();
        System.out.println(aa1 instanceof AA);
        System.out.println(aa1 instanceof AB);
        System.out.println(aa1 instanceof AA1);
        System.out.println(aa1 instanceof BA);
    }
}
abstract class AAa{

}
interface AA{

    void ma();
}
interface AB{
    void ab();
}
class AA1 implements AA{

    @Override
    public void ma() {

    }
}
class BA extends AA1 implements AB{

    @Override
    public void ab() {

    }
}