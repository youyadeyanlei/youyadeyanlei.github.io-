package cs.作业.Day722;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo05 {
//    private  int a;
//    protected  int b;
//    default int c;



    public static void main(String[] args) {

        HashMap<String,String> hashMap= new HashMap<String, String>();
        hashMap.put("TOm","CoreJava");
        hashMap.put("John","Order");
        hashMap.put("Susan","Oracle");
        hashMap.put("Kevin","JSP");
        hashMap.put("Allen","JDBC");
        hashMap.put("Kevi11n","JSP");
        hashMap.replace("Kevin","CoreJava");
       Set<Map.Entry<String,String>> entrySet =hashMap.entrySet();

//       for (Map.Entry<String, String> entry : entrySet) {
//           System.out.println(entry.getKey()+"+"+entry.getValue());
//       }
        System.out.println(hashMap.containsValue("JSP"));

    }
}
