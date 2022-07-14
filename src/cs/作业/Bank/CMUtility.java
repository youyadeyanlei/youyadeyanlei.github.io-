package cs.作业.Bank;

import java.util.Locale;
import java.util.Scanner;

public class CMUtility {
    public static Scanner scanner=new Scanner(System.in);
    /**
     * 选择
     */
    public static char readMenuSelection(){
        char c;
        for (; ;){
            String str =readKeyBoard(1,false);
            c =str.charAt(0);
            if (c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'){
                System.out.println("输入错误");
            }else break;
        }
        return c;
    }
    public static char readChar(){
        String str=readKeyBoard(1,false);
        return str.charAt(0);
    }  public static char readChar(char defaultValue){
        String str=readKeyBoard(1,true);
        return (str.length()==0)?defaultValue:str.charAt(0);
    }
    public static int readInt(){
        int n;
        for (; ;){
            String str=readKeyBoard(2,false);
            try {
                n=Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("错误");
            }
        }
        return n;
    }
    public static int readInt(int defaultValue){
        int n;
        for (; ;){
            String str=readKeyBoard(2,false);
            try {
                n=Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("错误");
            }
        }
        return n;
    }
    public static String readString(int limit){
        return readKeyBoard(limit,false);
    }
    public static String readString(int limit,String defeultValue){
        String str =readKeyBoard(limit,true);
        return str.equals("")?defeultValue:str;
    }
    public static char readConfirmSelection(){
        char c;
        for (; ;){
            String str=readKeyBoard(1,false).toUpperCase();
            c=str.charAt(0);
            if (c=='Y'||c=='N'){
                break;
            }else System.out.println("错误");
        }
        return c;
    }
    private static String readKeyBoard(int limit, boolean blank) {
        String line= "";
        while (scanner.hasNextLine()){
            line=scanner.nextLine();
            if (line.length()==0){
                if (blank)return  line;
                else continue;
            }
            if (line.length()<1||line.length()>limit){
                System.out.println("错误");
                continue;
            }
            break;
        }
        return line;

    }
}
