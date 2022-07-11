package cs.作业.day705;

public class demo04 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};

        System.out.println(getSum(a));


    }
    public static int getSum(int[] rumber){
        int len =rumber.length;
          int sum=0;
        if (len==0){
            return 0;
        }else for (int i = 0; i <len ; i++) {
            int s=rumber[i];
            sum+=s;
        }
        return sum;
    }
}
