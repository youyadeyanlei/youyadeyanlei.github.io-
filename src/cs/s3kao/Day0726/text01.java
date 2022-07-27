package cs.s3kao.Day0726;

public class text01 {

    public static void main(String[] args) {
        text01 t1=new text01();
        t1.threadMethod(0);
    }
    int count = 0; // 记录方法的命中次数
        public  synchronized void threadMethod(int j) {


            count++ ;

            int i = 1;

            j = j + i;
        }
    }



