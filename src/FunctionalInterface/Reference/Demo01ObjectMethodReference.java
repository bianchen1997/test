package FunctionalInterface.Reference;

/*
    通过对象名引用成员方法
    使用前提是对象名已经存在，成员方法也是已经存在
    就可以适用对象名引用成员方法
 */
public class Demo01ObjectMethodReference {
    public static void printString(Printable p) {
        p.print("tell");
    }

    public static void main(String[] args) {
//        方法引用(对象方法一定要有具体对象)
        printString(new MethodRerObject()::printUpperCaseString);

//        lambda表达式
        printString(str -> new MethodRerObject().printUpperCaseString(str));

    }
}
