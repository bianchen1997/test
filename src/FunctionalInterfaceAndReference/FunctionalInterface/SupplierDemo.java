package FunctionalInterfaceAndReference.FunctionalInterface;

import java.util.function.Supplier;

/*
    常用的函数式接口
    java.util.function.Supplier<T>接口仅包含一个无参方法:T get(),用来获取一个指定泛型对象数据

    Supplier<T>接口被称之为生产型接口,接口指定的泛型是什么类型,接口中的get就返回什么类型
*/
public class SupplierDemo {
    public static String getString(Supplier<String > sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        System.out.println(getString(()->"阿锟"));;
    }
}
