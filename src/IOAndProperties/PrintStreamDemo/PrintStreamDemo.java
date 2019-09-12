package IOAndProperties.PrintStreamDemo;

/*
    1.只负责数据的输出,不负责数据的读取
    2.与其他输出流不同,永远不会抛出IOException
    3.有特有的print,println方法
        void print()
        void println()

    Constructor:
        (File file)输出目的地是一个文件
        (OutputStream out)输出目的地是一个字节输出流
        (String fileName)输出目的地是一个文件路径
    注意:
        如果用继承父类的write()方法写数据,会查询编码表
        如果用print类的方法,则原样输出
    使用System.setOut方法可以改变输出语句的目的地为参数中传的打印流目的地
        static void setOut(PrintStream out)
 */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        System.out.println("在控制台");

        PrintStream ps = null;
        try {
            ps = new PrintStream("目的地是打印流.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(ps);
        System.out.println("我在打印流的目的地输出");

        ps.close();
    }
}
