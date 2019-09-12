package IOAndProperties.InputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
    read()读取多个字节的方法:
        通过byte[] 进行缓冲，一般指定数组大小为1024整数倍
 */
public class Demo02InputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File("src/IOAndProperties/b.txt"));
            byte[] bytes = new byte[2];
            int len = 0;
            while((len = fis.read(bytes)) != -1) {
                System.out.println(len);
                System.out.println(new String(bytes,0 ,len));
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
