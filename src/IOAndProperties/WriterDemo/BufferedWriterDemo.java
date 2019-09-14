package IOAndProperties.WriterDemo;

/*
    BufferedWriter extends Writer
    继承所有抽象方法
    constructor:
        (Writer writer)
        (Writer writer, int size)
    有一个特有的成员方法:
        void newLine():写入一个行分隔符，自适应

    使用步骤:
        1.创建字符缓冲输出流对象,参数传递字符流对象
        2.调用缓冲字符流中的write()方法,数据写入内存缓冲区中
        3.调用flush
        4.关闭资源
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt",true));) {
            bw.write("something old, something new");
            bw.newLine();
            bw.write("something borrowed, something blue");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
