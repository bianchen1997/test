package FunctionalInterfaceAndReference.Reference.ArrayReference;

//数组的构造器引用
public class Demo {
    /*
        定义一个方法
        方法的参数传递创建数组的长度和ArrayBuilder接口
        方法内部根据传递的长度ArrayBuilder中的方法创建数组并返回
     */

    public static int[] createArray(int length, ArrayBuilder ab) {
        return ab.buildArray(length);
    }

    public static void main(String[] args) {
//        调用createArray方法，传递数组的长度和lambda表达式
        int[] arr1 = createArray(10, len -> new int[len]);

//        构造器引用
        int[] arr2 = createArray(10, int[]::new);

        System.out.println(arr1.length);
        System.out.println(arr2.length);
    }
}
