package cs.作业.Day722;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap =new HashMap<Integer, String>();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        hashMap.put(1930,"乌拉圭");
        hashMap.put(1934,"意大利");
        hashMap.put(1938,"意大利");
        hashMap.put(1950,"乌拉圭");
        hashMap.put(1954,"德国");
        hashMap.put(1958,"巴西");
        hashMap.put(1962,"巴西");
        hashMap.put(1966,"英格兰");
        hashMap.put(1970,"巴西");

        if (hashMap.containsKey(n)) {
            System.out.println(hashMap.get(n)+"是世界冠军");   ;
        }else {
            System.out.println("没有举办");
        }
        //判断
//        judge(n,hashMap);
    }

    private static void judge(int n, HashMap<Integer, String> hashMap) {
     Set<Integer> keySet=hashMap.keySet();


    }

}
