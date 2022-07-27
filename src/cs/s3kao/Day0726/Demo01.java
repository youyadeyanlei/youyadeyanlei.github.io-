package cs.s3kao.Day0726;

public class Demo01 {
    public static void main(String[] args) {
        //打印线程名字
        System.out.println(Thread.currentThread().getName());

        //创建线程
        Thread t = new Thread(new DownloadFileTask());

        //开始
        t.start();

        try {
            //等待加入
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("下载完毕");

    }
}
