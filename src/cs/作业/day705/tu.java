package cs.作业.day705;

public class tu {
    public static void main(String[] args) {

   //     System.out.println(getCount(20));
        System.out.println(tu1(20));
    }
    public static int tu1(int s){

        if (s<=2){
            return 1;
        }
        return tu1(s-1)+tu1(s-2);
    }



        //案例三:不死神兔

        /**
         * @param count: 表示的第几位位置的数据
         * @return
         */
        public static  int getCount(int count){
            //1.第1个数字和第2个数字,不能递归
            if(count<=2){
                return  1;
            }else{
                //2.定义一个变量来接收第count位置的数据
                int sum =0;
                sum = getCount(count-1)+ getCount(count-2);
                return sum;
            }
        }

}
