package cs.s3kao.sock;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        while (true) {
            Socket socket = new Socket("127.0.0.1", 8080);
            OutputStream out = socket.getOutputStream();
            String word = input.next();
            if ("q".equals(word) || "over".equals(word)) {
                out.close();
                socket.close();
                break;
            }

            out.write(word.getBytes());
            out.close();
            socket.close();
        }
    }
}
