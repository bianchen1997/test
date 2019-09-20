package FunctionalInterfaceAndReference.FunctionalInterface;

public class Demo {
    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterfaceImpl());

        show(()-> System.out.println("lambda表达式重写"));

        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        });
    }
}
