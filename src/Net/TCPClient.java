package Net;

/*
    TCP通信的客户端:向服务器发送连接请求,给服务器发送数据,读取服务器回复的数据
    表示客户端的类:
        java.net.Socket:此类实现客户端套接字.套接字是两台机器间通信的端点
    Constructor:
        (String host, int port)
        host:服务器主机的名称/服务器的ip地址
        int port:服务器端口号
    成员方法:
        OutputStream getOutputStream()返回此套接字的输出流
        InputStream getInputStream()返回输入流
        void close()关闭套接字

    实现步骤:
        1.创建一个客户端对象Socket,绑定地址和端口
        2.使用Socket对象中的方法getOutputStream()获取网络字节输出流
        3.使用输出流中的方法write,给服务器发送数据
        4.使用Socket对象中的方法getInputStream()获取输入流
        5.使用网络字节输入流方法read(),读取服务器诙谐的数据
        6.释放资源(Socket)

    注意:
        1.客户端和服务器进行交互,必须使用Socket中提供的流,不能使用自己创建的流对象
        2.当我们创建客户端对象的时候,就回去请求服务器和三次握手
            如果没启动,会抛出异常
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            OutputStream os = socket.getOutputStream();
            os.write("你不知道我为什么离开你".getBytes());

            InputStream is = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));


            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
