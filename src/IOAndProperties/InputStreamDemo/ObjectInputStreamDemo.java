package IOAndProperties.InputStreamDemo;

/*
    反序列化流:将文件中保存的对象以流的方式读取出来使用
    ObjectInputStream extends InputStream

    Constructor:
        (InputStream in)
    特有方法:
        Object readObject()
    使用步骤:
        1.创建ObjectInputStream对象,从构造方法中传递字节输入流
        2.readObject()
        3.close
        4.使用读取的数据

    反序列化前提:
        1.implements Serializable
        2.存在具体的class文件

    static 静态不能被序列化
    transient 瞬态关键字修饰的成员变量不能被序列化

    反序列化
    自定义序列号:
        Static final long serialVersionUID = 1L;
 */

import IOAndProperties.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
            System.out.println(ois.readObject().toString());
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
