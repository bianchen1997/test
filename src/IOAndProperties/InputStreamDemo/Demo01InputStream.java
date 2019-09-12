package IOAndProperties.InputStreamDemo;

import java.io.FileInputStream;
import java.io.IOException;

/*
    构造方法:
        FileInputStream(String name)
        FileInputStream(File file)
        read():
            读取一个字节
 */
public class Demo01InputStream {
    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("src/IOAndProperties/b.txt");
//            int len = fis.read();
//            System.out.println(len);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        sout();

    }

    public static void sout() {
        try {
            int len = 0;
            FileInputStream fis = new FileInputStream("src/IOAndProperties/b.txt");
            while((len = fis.read())!=-1) {
                System.out.println((char)len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
