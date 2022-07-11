package cs.作业.day705;

public class demo01 {
    public static void main(String[] args) {
        /*
        1-n的阶乘
         */
        getMulti(10);
        addTwo(2,3);
     double aprice=      productPrice(110,0.8);
     double bprice= productPrice(100,0.7);
     size(aprice,bprice);
    }
    public static void size(double a,double b){
        if (a>b){
            System.out.println(a);
        }else if (a<b)
        {
            System.out.println(b);
        }else System.out.println("一样大"+a);
    }
    /**
     *
     * @param n int 类型的参数：参数名称n
     */
    public static void getMulti(int n){
        int multi=1;
        if (n>0){
            for (int i = 1; i <=n ; i++) {
                multi*=i;
            }
        }
        System.out.println(multi);
    }
    public static void addTwo(int a,int b){
        int sum= a+b;
        System.out.println(sum);
    }

    /**
     *
     * @param sourcePrice 商品的原始价格
     * @param hu 打折
     */
    public static double productPrice(int sourcePrice,double hu){
        double price=sourcePrice*hu;
        System.out.println(price);
        return price;
    }
}
