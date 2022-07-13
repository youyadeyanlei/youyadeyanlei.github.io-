package cs.作业.day713;

public class Demo03 {
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02(1,"a");
        demo02.name = "aa";
        demo02.voltage = 12;
        demo02.call();
        demo02.setName("bb");
        demo02.setVoltage(13);
        demo02.stop();
        demo02.start();
        demo02.setBluetooyh(3);
        demo02.setMobileType("vv");
        demo02.call();
    }
}
