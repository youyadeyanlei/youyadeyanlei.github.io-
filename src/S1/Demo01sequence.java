package S1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 斐波那契数列
 */
public class Demo01sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("请输入你要查询第几项的斐波那契数列：");
        int f = input.nextInt();
        int a = fun(f);
        System.out.println("查询如下");
        System.out.println(a);
        System.out.println("前几项如下");
        list.addAll(funsum(f));
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
    }

    /**
     * 递归算法
     * Functions:斐波那契数列: 1  1  2  3  5.....返回斐波那契数列的第20项数值
     */
    public static int fun(int a) {
        if (a == 0) {
            return 0;
        }
        if (a == 1 || a == 2) {
            return 1;
        } else {
            return fun(a - 1) + fun(a - 2);
        }
    }

    public static List<Integer> funsum(int a) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = a; i >= 0; i--) {
            sum = fun(i);
            list.add(sum);
        }
        return list;
    }

}
