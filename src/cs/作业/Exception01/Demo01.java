package cs.作业.Exception01;

public class Demo01 {
    public static void main(String[] args) {
        int a=10;
//        try {
//        System.out.println(a/0);
//
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
        System.out.println("zzz");
        String[] arr={"a","bxx","c"};
        vatch(arr);
        System.out.println("处理");

    }
    private  static void vatch(String[] arr){
        for (String s:arr){
            try {
                validate(s);
                saveItem(s);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("完成");
    }
   static int count;

    static void saveItem(String s){
        if (count++==1){
            throw  new RuntimeException("网络错误");
        }
        System.out.println("链接错误");
    }

    private static void validate(String s) throws Exception{
        if (s.length()>1){
            throw  new Exception("不符合");
        }else {
            System.out.println(s+"是符合的");
        }
    }
}
