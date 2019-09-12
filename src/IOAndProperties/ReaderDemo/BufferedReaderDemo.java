package IOAndProperties.ReaderDemo;

/*
    BufferedReader extends Reader
    constructor:
        (Reader reader)
        (Reader reader, int size) size:指定缓冲区大小
    特有方法:
        String readLine();
    使用步骤:
        1.创建缓冲字符流输入流对象
        2.使用read/或者readLine方法读取到缓冲区
        3.flush
        4.close
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("./a.txt"));
            String str;
            while((str = br.readLine())!=null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
