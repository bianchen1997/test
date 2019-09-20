package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    Stream流中的常用方法count:用于统计Stream流中的数据,返回一个long类型
    是一个终结方法
 */
public class Demo05Stream_count {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("12");
        list.add("123");
        list.add("1234");
        list.add("12345");
        list.add("123456");

        Stream<String> stream = list.stream();
        System.out.println(stream.count());

    }
}
