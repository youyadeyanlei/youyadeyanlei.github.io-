package cs.s3kao.Day0726;

public class Text001 {
    public static void main(String[] args) {
        SaleRunner saleRunner = new SaleRunner(100);
        Thread thread = new Thread(saleRunner);
        Thread thread1 = new Thread(saleRunner);
       thread1.start();
       thread.start();

    }

}
class SaleRunner implements Runnable{
    private  int Ticker;

    public SaleRunner(int ticker) {
        Ticker = ticker;
    }

    @Override
    public void run() {

        while (this.Ticker>0){
            System.out.println(Thread.currentThread().getName() + "票"+this.Ticker);

            this.Ticker--;
        }
    }
}
