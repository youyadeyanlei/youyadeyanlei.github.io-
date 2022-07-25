package cs.s3kao.sock;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class UploadThread implements Runnable {
   Socket socket;
    
    public UploadThread(Socket socket) {
this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream in = socket.getInputStream();
            String newFilename = UUID.randomUUID().toString().replace("-","");
            FileOutputStream fos = new FileOutputStream(newFilename);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer))!=-1){
                fos.write(buffer, 0, len);
            }
            OutputStream out=socket.getOutputStream();
            //out.write(newFilename).getBytes();
            
            out.close();
            fos.close();
            in.close();
            socket.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public Runnable start() {
//    return run();
//    }
}
