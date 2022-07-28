package cs.s3kao.Day0728;

public class Demo02 {
    enum Signal {
        // 定义一个枚举类型
        GREEN,YELLOW,RED;
    }
    public static void main(String[] args) {
        for(int i = 0;i < Signal.values().length;i++) {
            System.out.println("枚举成员："+Signal.values()[i]);
        }
        for(int i = 0;i < Signal.values().length;i++) {
            System.out.println("索引" + Signal.values()[i].ordinal()+"，值：" + Signal.values()[i]);
        }
    }

}
