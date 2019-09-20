package Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法 filter:用于对Stream流中的数据进行过滤
    Stream<T> filter(Predicate<? super T> predicate);

 */
public class Demo03Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream
                = Stream.of("王文涛", "王友富", "王凤琴", "王文波", "王建锟");
        stream
                .filter(str -> str.contains("文"))
                .forEach(name -> System.out.println(name));

//        Stream属于管道流，只能使用一次
//        第一个Stream流调用完毕方法，数据就流转到下一个Stream上
//        然后关闭第一个流
    }
}
