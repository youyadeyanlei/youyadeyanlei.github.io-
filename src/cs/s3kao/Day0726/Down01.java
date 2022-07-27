package cs.s3kao.Day0726;

public class Down01 {
    private int tota;
    public void  incrementtota(){
        tota++;
    }
    public int gettota(){
        return tota;
    }
}

 class Download01 implements Runnable {
    private Down01 status;

    public Download01(Down01 status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Down" + Thread.currentThread().getName());
        for (int i = 0; i < 1_000_0; i++) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            status.incrementtota();
        //    System.out.println("线程" + Thread.currentThread().getName());
        }
    }
}