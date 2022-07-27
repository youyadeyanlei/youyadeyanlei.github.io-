package cs.s3kao.Day0726;

public class DownloadFileTask01 implements Runnable {
    @Override
    public void run() {
        //打印当前线程
        System.out.println("Download:" + Thread.currentThread().getName());
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            System.out.println("Downloading - " + i);
        }
        System.out.println("Download complete:" + Thread.currentThread().getName());
    }
}

