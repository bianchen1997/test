package IOAndProperties.OutputStreamDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写/续写:使用两个参数的构造方法
       FileOutputStream(String name, boolean append)
       FileOutputStream(File file, boolean append)
    换行:
        windows:\r\n
        linux:/n
        mac:/r
 */
public class Demo03OutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(new File("src/IOAndProperties/b.txt"),true);
            for (int i = 0; i < 10; i++) {
                fos.write("吃屎".getBytes());
                fos.write('\r');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
