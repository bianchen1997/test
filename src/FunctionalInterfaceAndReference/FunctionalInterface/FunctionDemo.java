package FunctionalInterfaceAndReference.FunctionalInterface;

import java.util.function.Function;

/*
    Function<T, R>用来根据一个类型的数据得到另一个类型的数据
        前者称为前置条件，后者称为后置条件
    Function接口中最主要的抽象方法为:R apply(T t)，根据类型T的参数获取类型R的结果
        如将String转换为Integer类型
 */
public class FunctionDemo {
    /*
        定义一个方法
        传递一个字符串类型的整数，和一个Function接口，泛型使用<String,Integer>
        使用Function接口中的方法apply把字符串类型的整数转换成Integer类型的整数
     */

    public static void change(String s, Function<String, Integer> fun) {
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s ,str -> Integer.parseInt(str));
    }
}
