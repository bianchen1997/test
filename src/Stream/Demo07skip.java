package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo07skip {
    public static void main(String[] args) {
//        skip延迟方法，会跳过这个流的前几个对象
//        Stream<T> skip(long n) 参数大于流大小则返回大小为0的流
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("12");
        list.add("123");
        list.add("1234");
        list.add("12345");
        list.add("123456");

        Stream<String> stream = list.stream();
        stream.skip(2).forEach(name -> System.out.println(name));

    }
}
