package FunctionalInterfaceAndReference.FunctionalInterface;

import java.util.function.Consumer;

//    Consumer接口中的默认方法andThen可以把两个Consumer接口的实现类进行共同消费
//    链接两个Consumer接口消费字符串,例如con1.andThen(con2).accept();
//    先消费的在前面
public class AndThenDemo {
    //定义一个方法，传递一个字符串和两个Consumer接口
    public static void method(String name , Consumer<String> con1, Consumer<String> con2) {
        con1.accept(name);
        con2.accept(name);
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        method("hello", name-> System.out.println(name.toLowerCase()), name-> System.out.println(name.toUpperCase()));
    }
}
