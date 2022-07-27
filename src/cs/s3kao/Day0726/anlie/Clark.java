package cs.s3kao.Day0726.anlie;

public class Clark {
    //产品最多5个
    private  int product;
    //添加
    private int a;
    public void addProduct(){

        if (a==100){
            return;
        }
        if (product<5){
            product++;
            a++;
            notifyAll();
            System.out.println(Thread.currentThread().getName() + "生产了一个商品，还剩"+product);
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    //消费
    public void desProduct(){

        if (product >0) {
            product--;
            notifyAll();
            System.out.println(Thread.currentThread().getName() + "消费刚商品，还剩"+product);
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
