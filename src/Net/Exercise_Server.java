package Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Exercise_Server {
    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(1997);
        while (true) {

            Socket socket = serverSocket.accept();

            new Thread() {
                public void run() {
                    try {

                        InputStream sis = socket.getInputStream();
                        FileOutputStream fos = new FileOutputStream(System.currentTimeMillis()+ new Random().nextInt() + ".txt");

                        int len = 0;
                        while ((len = sis.read()) != -1) {
                            fos.write(len);
                        }

                        System.out.println("写完了");
                        fos.close();

                        OutputStream sos = socket.getOutputStream();
                        sos.write("上传成功".getBytes());
                        sos.close();
                        sis.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();


        }
    }
}
