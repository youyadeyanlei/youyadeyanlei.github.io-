package cs.s3kao.Day0726.p1;

/**
 * 商店
 */
public class Shop {
    //货架
    private int shelves;
    private int addtotal;
    private int destotal;

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public int getAddtotal() {
        return addtotal;
    }

    public void setAddtotal(int addtotal) {
        this.addtotal = addtotal;
    }

    public int getDestotal() {
        return destotal;
    }

    public void setDestotal(int destotal) {
        this.destotal = destotal;
    }

    //添加货架
    public void addShelves() {

//        if (addtotal == 100) {
//            System.out.println(addtotal+"+"+destotal+"+"+shelves);
//            return;
//        }
        if (shelves < 8) {
            addtotal++;
            shelves++;
            notifyAll();
            System.out.println(Thread.currentThread().getName() + "生产了一个，还有:" + shelves);
        } else {

            try {
                //    notifyAll();
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    //消费货架
    public void desShelves() {

        if (shelves > 0) {
            shelves--;
            destotal++;
            notifyAll();
            System.out.println(Thread.currentThread().getName() + "消费了一个，还有:" + shelves);
        } else {

            try {
                // notifyAll();
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
