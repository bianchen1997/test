package FunctionalInterface.FunctionalInterface;

import java.util.function.Function;

/*
    Function接口中的默认方法andThen:
        用来进行组合操作
    example:
        1.把String类型转换成int类型
        2.把int类型+10
        3.把int转换成字符串
 */
public class FunctionAndThen {
    public static void main(String[] args) {
        String str = "869783484";

        method(str, s -> Integer.parseInt(s) + 10, i -> String.valueOf(i));
    }

    public static void method(String str, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        System.out.println(str);
        System.out.println(fun1.andThen(fun2).apply(str));
    }

}
