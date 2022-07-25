package cs.作业.FileDemo01;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        File file= new File("D:\\gugu\\a.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        System.out.println("判读文件是否存在"+file.exists());
        System.out.println("判断是否是文件"+file.isFile());
        System.out.println("判断是否是文件夹"+file.isDirectory());
        System.out.println("获取文件或者文件夹的名字—"+file.getName());
        System.out.println("获取大小"+file.length());
        System.out.println("获取相对路径"+file.getPath());
        System.out.println("获取绝对路劲String"+file.getAbsolutePath());
        System.out.println("获取文件的绝对路径File"+file.getAbsoluteFile());
        System.out.println("获取父目录String"+file.getParent());
        System.out.println("获取父目录file"+file.getParentFile());
        System.out.println("获取文件所在磁盘"+file.getTotalSpace());
        System.out.println("获取文件所在位置的可用空间"+file.getFreeSpace());
        System.out.println("获取文件的最后修改"+file.lastModified());
        System.out.println("文件是否可读"+file.canRead());
        System.out.println("是否可写"+file.canWrite());
        System.out.println("是否可以执行"+file.canExecute());
        System.out.println("是否隐藏"+file.isHidden());
    }
}
