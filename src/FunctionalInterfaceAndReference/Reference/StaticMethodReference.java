package FunctionalInterfaceAndReference.Reference;

/*
    通过类名引用静态成员方法
    类已经存在，静态成员方法也已经存在
    就可以通过类名直接引用静态成员方法
 */
public class StaticMethodReference {
//    定义一个方法，方法的参数传递要计算绝对值的整数、函数式接口Calcable
    public static int method(int number, Calcable c) {
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
//        lambda
        System.out.println(method(-100, i -> Math.abs(i)));

//        静态引用函数名
        System.out.println(method(-100, Math::abs));
    }
}
