package IOAndProperties.PropertiesDemo;

/*
    java.util.Properties extends Hashtable<k,v> implements Map<k,v>
    Properties表示一个持久的属性集.可保存在流中或从流中加载
    是唯一一个和IO流结合的集合
    用store()方法可以把集合中的零时数据，持久化的写入硬盘
    用load()方法可以从硬盘中加载数据

    键值对默认都是字符串
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
//        fun_1();
//        fun_2();
        fun_load();
    }

    public static void fun_load() {
        /*
            可以使用Properties中的load(),读取到集合中使用
            void load(InputStream inStream)
            void load(Reader reader)
            参数:
                Reader能读中文
            使用步骤:
                1.创建Properties集合对象
                2.使用Properties中的load保存文件
                3.遍历集合
            注意:
                1.存储键值对的文件中,默认连接符号可以用=,空格
                2.~,可以使用#进行注释
                3.文件中已经默认全是字符串
         */

        Properties prop = new Properties();
        try {
            prop.load(new FileReader("./test1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set<String> set = prop.stringPropertyNames();
        for(String str:
        set) {
            System.out.println(str);
            System.out.println(prop.get(str));
        }

    }

    public static void fun_1() {
        Properties prop = new Properties();
        prop.setProperty("阿锟1","1997");
        prop.setProperty("阿锟2","1997");
        prop.setProperty("阿锟3","1997");

        Set<String> set = prop.stringPropertyNames();//此方法返回属性列表中的键值对,全是String

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next + prop.getProperty(next));
        }
    }

    public static void fun_2() {
        /*
            使用store()和load()持久化
            void store(OutputStream out, String comments)
            void Store(Writer writer, String comments)
            参数:
                OutputStream out:字节输入流，不能写入中文
                Writer:字节输入流，可写中文
                comments:注释，不能用中文，一般用空字符串

            步骤:
                1.创建Properties集合对象,添加数据
                2.创建流,绑定输出目的地
                3.使用store()
                4.释放资源
         */
        Properties prop = new Properties();
        prop.setProperty("阿锟1","1997");
        prop.setProperty("阿锟2","1998");
        prop.setProperty("阿锟3","1999");

        try(
                FileWriter fw = new FileWriter("./test1.txt");
        ) {
            prop.store(fw, "");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
