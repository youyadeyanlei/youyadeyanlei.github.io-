package cs.作业.day713;

public class Demo02 extends Demo01{
    private  String mobileType;
    private int bluetooyh;

    public Demo02(int voltage, String name) {
        super(voltage, name);
    }


    public void call(){
        System.out.println(name);
        System.out.println(voltage);
        System.out.println("继承");
        System.out.println(bluetooyh);
        System.out.println(mobileType);
    }

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String mobileType) {
        this.mobileType = mobileType;
    }

    public int getBluetooyh() {
        return bluetooyh;
    }

    public void setBluetooyh(int bluetooyh) {
        this.bluetooyh = bluetooyh;
    }
}
