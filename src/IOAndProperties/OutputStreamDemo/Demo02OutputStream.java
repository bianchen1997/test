package IOAndProperties.OutputStreamDemo;

import java.io.File;
import java.io.FileOutputStream;

/*
    一次写多个字节的方法：
        - public void write(byte[] b):将b.length字节从指定字节数组写入此输出流
        - public void write(byte[] b, int off, int len):
            从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
            如果第一个字节是正的，那么查询asc表
            如果第一个字节是负的，那么和下一个组成一个中文
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream(new File("src/IOAndProperties/b.txt"));
        String str = new String("123456789");
        fos.write(str.getBytes());
        fos.close();
    }
}
