package cs.s3kao.Day0727;

public class Quote {
    private String name;
    private  int price;

    public Quote(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
