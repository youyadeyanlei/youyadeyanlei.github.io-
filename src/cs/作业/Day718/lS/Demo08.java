package cs.作业.Day718.lS;

public class Demo08 {
    public static void main(String[] args) {

        /**
         * 首先得到一个大于6的偶数
         * 写一个方法判断是否为偶数
         * 将偶数拆分为2个奇数
         * 分别判断2个奇数是否为质数
         * 拆分2个奇数写成一个方法
         * 判断是否为质数写成一个方法
         */

    }
}
//拆分
abstract class sql{

   public abstract void shu(int i);
}
interface qwe{
    void jian(int i);
}
class split extends sql implements qwe{
    int[] b=new int[2];
    public void shu(int i) {

        for (int j = 2; j < i; j++) {
            if (j % 2 != 0) {
                if ((i - 1) % j == 0)return;
            }
        }
    }

    @Override
    public void jian(int i) {

        for (int j = 0; j <i/2 ; j++) {
            b[0]=i-j;
        }
    }
}
