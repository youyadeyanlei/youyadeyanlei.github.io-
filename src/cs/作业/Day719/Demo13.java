package cs.作业.Day719;

public class Demo13 {
    public static void main(String[] args) {
        String str="ABCDEFGHjklmn1348258452";
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <4 ; i++) {
            int a=(int)( Math.random()*10);
            System.out.println(a);
           // str.indexOf(a);
            stringBuilder.append(str.charAt(a));
        }

        System.out.println(stringBuilder);
    }
}
