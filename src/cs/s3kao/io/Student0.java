package cs.s3kao.io;

import java.io.*;
import java.util.*;

public class Student0 {
 //   static File file = new File("d:\\gugu\\a.txt");
    public static void main(String[] args) throws IOException {
        List<Demo01Student> list = new ArrayList<>();
        Collections.addAll(list, STudent());
        FileOutputStream fos = new FileOutputStream("D:\\gugu\\a.txt");
    //    BufferedOutputStream bos = new BufferedOutputStream(fos);

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
        fos.close();

   //     write(list);

  //      read(list);





//        FileOutputStream fos = new FileOutputStream("D:\\gugu\\a.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(list);
//        oos.close();
//        fos.close();

        // File file= new File("D:\\gugu\\a.txt");
//        FileOutputStream fos = new FileOutputStream("D:\\gugu\\a.txt");
//
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        //oos.writeInt();
//
//        oos.writeUTF(String.valueOf(list));
//        oos.close();
//        fos.close();
//
//        FileInputStream fis = new FileInputStream("D:\\gugu\\a.txt");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//
//        System.out.println(ois.readInt());
//        System.out.println(ois.readDouble());
//       // System.out.println(ois.UTF());
//
//        ois.close();
//        fos.close();

        Iterator<Demo01Student> it = list.iterator();
        while (it.hasNext()) {
            Demo01Student str = it.next();
            System.out.println(str.toString());
        }

    }

    private static void read(List<Demo01Student> list) throws IOException {
//        ObjectOutputStream objectOutputStream;
//        objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//
//        objectOutputStream.writeObject(list);
//        objectOutputStream.flush();
//        objectOutputStream.close();
        File file = new File("D:\\gugu\\q.txt");
//		Boolean flag =file.exists();
//		System.out.println(flag);
        //将list写入文件
        Writer out = new FileWriter(file);
        BufferedWriter bw= new BufferedWriter(out);
        for(Demo01Student s:list) {
            bw.write(String.valueOf(s));
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }


    private static void write(List<Demo01Student> list) {

    }

    public static Demo01Student[] STudent() {
        Demo01Student[] d = new Demo01Student[60];
        for (int i = 0; i < d.length; i++) {
            d[i] = new Demo01Student(210501 + i, random0(), random0(), random0(), 0);
            //  System.out.println(d[i]);
        }
        return d;
    }

    public static int random0() {
        Random rand = new Random();
        return rand.nextInt(50) + 51;
    }


}
