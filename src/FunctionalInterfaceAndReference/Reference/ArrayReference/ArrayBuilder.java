package FunctionalInterfaceAndReference.Reference.ArrayReference;

//定义一个创建数组的函数式接口
@FunctionalInterface
public interface ArrayBuilder {
    int[] buildArray(int length);
}
