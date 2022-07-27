package cs.s3kao.Day0726;

public class Demo001 {
    public static void main(String[] args) {

//        Thread t1=new SubThread();
//线程,继承了Thread，run里面就是线程体
        SubThread subThread01 = new SubThread();
        SubThread subThread02 = new SubThread();
        subThread01.start();
        subThread02.start();

    }


    private static class SubThread extends Thread {
        @Override
        public void run() {
            /*
            d打印
             */
            for (int i = 0; i <=10;i++) {
                System.out.println(Thread.currentThread().getName() + ":"+i);

            }

        }
    }
}
