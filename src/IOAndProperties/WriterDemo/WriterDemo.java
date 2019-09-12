package IOAndProperties.WriterDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer -> abstract class
    void write(int c)
    void write(char[] cbuf)
    abstract void write(char[] cbrf, inf off, int len)
    void write(String str)
    void write(String str, int off, int len)

    FileWriter是一个文件字符输入流
    constructor:
        FileWriter(File file)
        FileWriter(String path)
    使用步骤:
        1.创建FileWriter对象绑定到指定文件
        2.使用write方法将字符写入缓冲区
        3.使用flush将缓冲区的字符刷新到文件中
        4.关闭资源(先刷新数据)

 */
public class WriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter(new File("./test.txt"),true);
            fw.write("你不知道我为什么离开你");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
