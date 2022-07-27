package cs.s3kao.Day0726;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Download:" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download complete:" + Thread.currentThread().getName());
    }
}
