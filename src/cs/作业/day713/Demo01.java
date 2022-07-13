package cs.作业.day713;

public class Demo01 {
    protected  int voltage;
    protected String name;

    public Demo01(int voltage, String name) {
        this.voltage = voltage;
        this.name = name;
    }

    public void  start(){
        System.out.println("开机..");
    }
    public void  stop(){
        System.out.println("a关机");
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
