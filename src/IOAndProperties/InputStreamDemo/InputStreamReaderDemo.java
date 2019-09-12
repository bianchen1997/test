package IOAndProperties.InputStreamDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    InputStreamDeader extends Reader
    字节流通向字符流的桥梁
    constructor:
        (inputStream in)
        (inputStream in, String charset)

    步骤:
        1.创建InputStreamReader对象,传递参数并指定编码
        2.用对象的Read方法读取文件
        3.关闭资源
    注意:
        读取的文本编码要和指定编码一致
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) {
        read_gbk();
        read_utf_8();
    }

    private static void read_utf_8() {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("utf_8.txt"), "utf-8");
            int len = 0;
            while ((len=isr.read())!=-1) {
                System.out.print((char)len);
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read_gbk() {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"), "gbk");
            int len = 0;
            while ((len=isr.read())!=-1) {
                System.out.print((char)len);
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
