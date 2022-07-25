package cs.s3kao.sock;

import cs.作业.Student.Console;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        //创建客服端对象
        Socket socket = new Socket("127.0.0.1",8080);
        //
        OutputStream out = socket.getOutputStream();
        //
        //控制台封装
        //Console console = new Console();


        out.write("hello".getBytes());
        out.close();
        socket.close();

    }
}
