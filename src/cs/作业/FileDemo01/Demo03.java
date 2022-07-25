package cs.作业.FileDemo01;

import java.io.*;

public class Demo03 {
    public static void main(String[] args) throws IOException {

        copy();
    }
    static void copy() throws IOException {
        String s1="D:\\gugu\\a.txt";
        String s2="D:\\gugu\\b.txt";
        InputStream in=new FileInputStream(s1);
        OutputStream on=new FileOutputStream(s2);

        byte[] buffer= new  byte[1024];
        int len;
        while ((len=in.read(buffer))!=-1){
            on.write(buffer,0,len);
        }
        in.close();
        on.close();



    }
}
