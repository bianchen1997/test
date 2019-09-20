package Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    获取流对象的两种方式
         1.通过Collection 接口的默认方法 Stream()获取流对象
            default Stream<E> stream()
         2.通过Stream 类的静态方法 of()获取流对象
            Static<T> stream<T> of (T... values)
            参数是可变参数，可以传递一个数组
 */
public class GetStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();
        Map<String, String> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

//        数组也可以转换成Stream流，不多赘述
    }
}
