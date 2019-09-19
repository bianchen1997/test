package FunctionalInterface.FunctionalInterface;

import java.util.function.Function;

public class FunctionExercise {

    /*
        给定字符串
        截取字符串为int
        数据变化
        转换String

     */
    public static void main(String[] args) {
        String str = new String("阿锟是个大帅比今年,26");
        method(str,s -> Integer.parseInt(s.split(",")[1]) + 100, i -> String.valueOf(i));
    }

    public static void method(String str, Function<String ,Integer> fun1,
                              Function<Integer, String> fun2) {
        str = fun1.andThen(fun2).apply(str);
        System.out.println(str);
    }

}
