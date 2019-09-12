package IOAndProperties.ReaderDemo;

import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader:字符流顶级父类,抽象类.
    已定义方法:
        int read() 读取单个字符并返回
        int read(byte[] cbuf) 读取多个字符存到数组
        void close() 释放资源
    java.io.FileReader extends InputStreamReader extends Reader
    FileReader:文件字符输入流
    构造方法参数:
        FileReader(String path)
        FileReader(File file)
    使用步骤:
        1.创建FileReader指向目标资源
        2.调用FileReader中的read()方法读取文件
        3.关闭资源
 */
public class ReaderDemo01 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/IOAndProperties/b.txt");
            int len = 0;
            while((len = fileReader.read()) != -1) {
                System.out.print((char)len);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
