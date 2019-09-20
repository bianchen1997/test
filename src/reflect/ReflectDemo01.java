package reflect;

import domain.Person;

public class ReflectDemo01 {
    public static void main(String[] args) {
//        1.Class.forName("全类名")
//        多用于配置文件，将类名定义在配置字符串中读取文件加载类
        try {
            Class cls1 = Class.forName("domain.Person");
            System.out.println(cls1);

//        2.类名.class
//            多用于参数传递
            Class cls2 = Person.class;
            System.out.println(cls2);

//        3.对象.class
//            多用于对象获取字节码
            Class cls3 = new Person().getClass();
            System.out.println(cls3);

            System.out.println(cls1 == cls2);
            System.out.println(cls2 == cls3);

//            结论：同一个类只被加载一次

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
