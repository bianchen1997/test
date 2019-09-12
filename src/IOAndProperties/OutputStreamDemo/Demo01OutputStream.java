package IOAndProperties.OutputStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    使用步骤：
        1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        2.调用FileOutputStream对象中的方法write，把数据写入到文件中
        3.释放资源
 */
public class Demo01OutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("src/IOAndProperties/a.txt");
            fos.write(97);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
