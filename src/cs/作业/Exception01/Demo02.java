package cs.作业.Exception01;

public class Demo02 {

    public static void main(String[] args) {
        int result = m();
        //100
        System.out.println(result);
    }

    /**
    java语法规则（有一些规则是不能破坏的，一旦这么说了，就必须这么做！）：
        java中有一条这样的规则：
            方法体中的代码必须遵循自上而下顺序依次逐行执行（亘古不变的语法！）
        java中海油一条语法规则：
            return语句一旦执行，整个方法必须结束（亘古不变的语法！）
     */
    public static int m() {
        int i = 1;
        try {
            // 这行代码出现在int i = 1;的下面，所以最终结果必须是返回1
            // return语句还必须保证是最后执行的。一旦执行，整个方法结束。
            return i;
        } finally {
            i++;
        }

    }

}
