package FunctionalInterface.FunctionalInterface;

import java.util.function.Predicate;

//传递一个字符串，传递两个predicate接口lambda，用and进行综合判断
//用or综合判断
//使用negate取反
public class PredicateAnd {
    public static void main(String[] args) {
        System.out.println(synthetic("阿锟大帅比", str->str.contains("帅"), str->str.length()>=5));
    }

    private static boolean synthetic(String str, Predicate<String> pre1, Predicate<String> pre2) {
//       return pre1.and(pre2).test(str);
//       return pre1.or(pre2).test(str);
        return pre1.negate().test(str);
    }
}
