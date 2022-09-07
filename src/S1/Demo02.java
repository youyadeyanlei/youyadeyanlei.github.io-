package S1;



import java.io.File;

public class Demo02 {
    public static void main(String[] args) {
        //下面输入显示的指定文件目录
        String path="D:\\dd\\3524860396\\FileRecv";

        //    File file=new File(path);
        treeWalk(path);
    }
    private static void treeWalk(String path){
        File file=new File(path);
        if (file.isFile()) {
            System.out.println(file.getName());
        }else {
            File[] children =file.listFiles();
            for (File f: children){
                treeWalk(f.getAbsolutePath());
            }
        }
    }
}
