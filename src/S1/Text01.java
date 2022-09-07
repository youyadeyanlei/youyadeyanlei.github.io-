package S1;

public class Text01 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Cricle c = new Cricle() ;
        c.setP1(p1);//圆心
        c.setP2(p2);//随便一点
        c.setR(2);//半径
        c.sum();//面积
        c.inOrOut();//是否在圆内
    }
}
class Point{
    private double x,y;//点的坐标

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
class Cricle {
    Point p1 ; // 圆心
    Point p2 ; // 随便一点
    private double r ;//半径

    public void sum () {//求圆面积
        System.out.println("圆的面积为："+Math.PI*r*r);

    }

    public void inOrOut () {//判断一点是否在圆内
        if( Math.pow( p1.getX()-p2.getX() , 2) + Math.pow(  p1.getY()-p2.getY() , 2 ) >= Math.pow(r, 2))
            System.out.println("不在圆内");
        else
            System.out.println("在圆内");
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

}
