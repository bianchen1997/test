package Stream;

import java.util.stream.Stream;

/*
    如果需要将流中的元素映射到另一个流中，可以使用map方法
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    Function中的抽象方法:
        R apply (T t);

 */
public class Demo04Stream_map {
    public static void main(String[] args) {
//        获取一个String类型的Stream流
        Stream<String> stream1 = Stream.of("1", "2", "3", "4");
        Stream<Integer> stream2 = stream1.map(str -> Integer.parseInt(str));

        stream2.forEach(name-> System.out.println(name));
    }
}
