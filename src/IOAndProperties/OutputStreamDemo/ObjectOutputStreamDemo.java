package IOAndProperties.OutputStreamDemo;

/*
    对象序列化流
    ObjectOutputStream extends OutputStream
    特有方法:
        void writeObject(Object obj)
 */

import IOAndProperties.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
            oos.writeObject(new Person("阿锟",21));
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
