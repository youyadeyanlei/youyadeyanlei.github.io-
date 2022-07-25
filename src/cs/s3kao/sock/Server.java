package cs.s3kao.sock;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器
        ServerSocket ss=new ServerSocket(8080);
        //获取对象
        Socket socket =ss.accept();
        //获取输入流
        InputStream is = socket.getInputStream();
        //通过输入流读取
        int len;
        byte[] buf = new byte[1024];
        while ((len = is.read(buf))!=-1){
            //字节转换字符
            String str = new String(buf, 0, len);
            System.out.println(str+"server");
        }
        is.close();
        socket.close();
        ss.close();
    }
}
