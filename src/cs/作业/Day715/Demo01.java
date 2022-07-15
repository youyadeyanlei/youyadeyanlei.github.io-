package cs.作业.Day715;

public class Demo01 {

    int x;
    int y;

    public Demo01(int x, int y) {
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        Demo01 demo01;
        if ((obj instanceof Demo01)) {
            demo01 = (Demo01) obj;
            return (x == demo01.x && y == demo01.y);
        }
        return false;

    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01(1, 2);
        Demo01 demo011 = new Demo01(1, 3);

        Demo01 demo012 = new Demo01(1, 3);
        demo01.equals(demo011);
        System.out.println(demo011.equals(demo012));

    }
}
