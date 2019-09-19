    package StreamAndReference;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.stream.Stream;

    public class Demo06limit {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("1");
            list.add("12");
            list.add("123");
            list.add("1234");
            list.add("12345");
            list.add("123456");

            Stream<String> stream = list.stream();
            Stream<String> limit = stream.limit(2);

            /*
                limit是一个延迟方法，返回的是一个新的流，所以可以继续调用Stream中的其他方法
             */

            System.out.println(limit.count());
        }
    }
