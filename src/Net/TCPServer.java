package Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP通信的服务器端:接收客户端的请求,读取客户端发送的数据,给客户端回写数据
    表示服务器的类:
        java.net.ServerSocket
    构造方法:
        ServerSocket(int port)创建绑定到特定端口的服务器套接字

    服务器端必须明确一件事情,必须知道是哪个客户端请求的服务器
    所以使用accept方法获取到请求的客户端对象Socket

    服务器的实现步骤:
        1.创建服务器ServerSocket对象和系统要指定的端口号
        2.使用ServerSocket对象中的方法accept获取到请求的客户端对象Socket
        3.使用getInputStream获取网络字节输入流
        4.read方法读取
        5.使用Socket对象中的方法获取输出流
        6.write方法回写
        7.close
 */

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));

            OutputStream os = socket.getOutputStream();
            os.write("烟一支一支一支的点".getBytes());

            os.close();
            is.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
