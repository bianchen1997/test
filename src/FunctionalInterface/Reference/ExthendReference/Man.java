package FunctionalInterface.Reference.ExthendReference;

//subClass
public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("sayHello from subClass");
    }

    public void method(Greetable g) {
        g.greet();
    }

    public void show() {
//        调用method方法，方法的参数是函数式接口，可以传递lambda
//        method(() -> {
//            Human h = new Human();
//            h.sayHello();
//        });
//        因为有继承关系，所以存在一个关键字super代表父类，可以直接使用super调用父类成员方法
//      使用super的lambda表达式
        method(() -> super.sayHello());

//      方法引用
        method(super::sayHello);

    }

    public static void main(String[] args) {
        new Man().show();
    }
}
