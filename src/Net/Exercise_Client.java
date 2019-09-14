package Net;

import java.io.*;
import java.net.Socket;

/*
    CS之间传文件的时候记住要用 Socket.shutdownOutput()写入终止符
 */

public class Exercise_Client {
    public static void main(String[] args) {
        new Thread(()->{
            try {
                InputStream is = new FileInputStream("a.txt");
                Socket socket = new Socket("127.0.0.1", 1997);

                OutputStream sos = socket.getOutputStream();

                int len = 0;
                while ((len = is.read()) != -1) {
                    sos.write(len);
                }
                socket.shutdownOutput();
                is.close();

                InputStream sis = socket.getInputStream();

                byte[] bytes = new byte[1024];
                len = sis.read(bytes);

                System.out.println(new String(bytes, 0, len));

                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()-> {
            try {
                InputStream is = new FileInputStream("a.txt");
                Socket socket = new Socket("127.0.0.1", 1997);

                OutputStream sos = socket.getOutputStream();

                int len = 0;
                while ((len = is.read()) != -1) {
                    sos.write(len);
                }
                socket.shutdownOutput();
                is.close();

                InputStream sis = socket.getInputStream();

                byte[] bytes = new byte[1024];
                len = sis.read(bytes);

                System.out.println(new String(bytes, 0, len));

                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }).start();
    }
}
