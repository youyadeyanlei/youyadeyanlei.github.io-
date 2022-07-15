package cs.作业.Day715;

public class Demo05 {
    public static void main(String[] args) {

        Device device=new Cooker();
        Device device1= device;//向上转型
        Cooker a= (Cooker) device1;//向下转型
    }

}
//电器
class Device{

}
//电磁炉
class Cooker extends Device{

}