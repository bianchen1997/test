package StreamAndReference;

import java.util.stream.Stream;

/*
    组合两个流的方法
    static<T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo08concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六", "田七");
        Stream<String> stream2
                = Stream.of("王文涛", "王友富", "王凤琴", "王文波", "王建锟");
        Stream.concat(stream1, stream2)
            .forEach(name -> System.out.println(name));

    }
}
