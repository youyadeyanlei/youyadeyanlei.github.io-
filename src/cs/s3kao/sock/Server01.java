package cs.s3kao.sock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("服务器开启");
        //获取对象
        while (true) {
            //socket对象的获取
            Socket socket = ss.accept();
            //获取客服端
            String ip = socket.getInetAddress().getHostAddress();
            //创建线程
             new  Thread(new Runnable() {
                 @Override
                 public void run() {
                     try {
                         InputStream is = socket.getInputStream();
                         BufferedReader br=new BufferedReader(new InputStreamReader(is));
                         String readLine=br.readLine();
                         System.out.println(ip + "输入"+readLine);

                         is.close();
                         socket.close();
                     } catch (IOException e) {
                         throw new RuntimeException(e);
                     }
                 }
             }).start();

        }

    }
}
