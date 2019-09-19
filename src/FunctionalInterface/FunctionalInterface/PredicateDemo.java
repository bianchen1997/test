package FunctionalInterface.FunctionalInterface;

import java.util.function.Predicate;

//用于逻辑判断的函数式接口，返回一个boolean值
//包含一个抽象方法boolean test(T t)
//包含三个默认方法 and or
public class PredicateDemo {
    public static void main(String[] args) {
        System.out.println(test("阿锟是个大帅比", str->str.contains("帅")));
    }

    public static boolean test(String str , Predicate<String> pr) {
        return pr.test(str);
    }
}
