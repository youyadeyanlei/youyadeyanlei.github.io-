package cs.s3kao.Day0726.anlie;
/**
客户,消费者
 */
public class client extends Thread {
  private  Clark clark;

    public client(Clark clark) {
        this.clark = clark;
    }

    @Override
    public void run() {
        while (true) {
            //消费
            synchronized (clark){
            clark.desProduct();

            }
        }
    }
}
