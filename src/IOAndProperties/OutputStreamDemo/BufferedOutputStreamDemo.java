package IOAndProperties.OutputStreamDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    BufferedOutputStream extends OutputStream
    constructor:
        (OutputStream out)
        (OutputStream out, int size)
    size:
        缓冲区
    可以使用所有OutputStream方法
    使用步骤:
        1.创建一个OutputStream绑定目的地
        2.创建BufferedOutputStream对象
        3.使用BufferedOutputStream对象中的方法写入内部缓冲区
        4.使用flush刷新
        5.释放资源
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        try(
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./a.txt"));

        ){
            bos.write("你不知道我为什么离开你".getBytes());
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
