package cs.作业.Day715;

public class Demo09 {
    public static void main(String[] args) {

        USbtest uSbtest =new USbtest();
        Flash flash=new Flash();
        uSbtest.trans(flash);
    }
}
 class USbtest{
    public void trans(Usb usb){
        usb.start();
        System.out.println("1");
        usb.stop();
    }
}
interface Usb{

    void start();
    void stop();
}
class Flash implements Usb{

    @Override
    public void start() {
        System.out.println("开始工作");
    }

    @Override
    public void stop() {
        System.out.println("结束工作");

    }
}
class  Printer implements Usb{

    @Override
    public void start() {
        System.out.println("da");
    }

    @Override
    public void stop() {

        System.out.println("ting");
    }
}
