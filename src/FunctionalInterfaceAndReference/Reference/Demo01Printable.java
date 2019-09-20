package FunctionalInterfaceAndReference.Reference;

public class Demo01Printable {
    public static void printString(Printable p) {
        p.print("Hello World");
    }

    public static void main(String[] args) {
        printString(s-> System.out.println(s));
        printString(System.out::println);
    }
    /*
        lambda要表达的函数方案已经存在与某个方法的实现中
        可以用双冒号来引用该方法作为lambda的替代
        参数一定要是可接受的类型，否则会报错
     */
}
