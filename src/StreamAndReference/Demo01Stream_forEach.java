package StreamAndReference;

import java.util.stream.Stream;

/*
    Stream中的终结方法
    forEach(Consumer<? super T> action)
    count()
    Stream流中的forEach:
        遍历流中的数据，遍历之后不能继续使用Stream流中的其他方法
 */
public class Demo01Stream_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(name-> System.out.println(name));

    }
}
