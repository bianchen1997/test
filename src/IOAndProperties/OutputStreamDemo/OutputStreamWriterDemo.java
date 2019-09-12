package IOAndProperties.OutputStreamDemo;

/*
    OutputStreamWriter extends Writer
    是字符通向字节的桥梁,可以指定编码表
    constructor:
        (OutputStream os)使用默认编码
        (OutputStream os, String charsetName)指定编码
    使用步骤:
        1.创建OutputStreamWriter对象,参数中传递指定编码
        2.使用write()方法将内存中的数据写入缓冲区(编码)
        3.flush
        4.close
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        utf_8();
//        gbk();
    }

    private static void gbk() {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "GBK");
            osw.write("你不知道我为什么离开你");
            osw.flush();
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void utf_8() {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf_8.txt"), "UTF-8");
            osw.write("你不知道我为什么离开你,我坚持不能说放任你哭泣");
            osw.flush();
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
