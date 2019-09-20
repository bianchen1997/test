package reflect;

import domain.Person;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
//        0.获取Person的Class对象
        Class Person = domain.Person.class;
//        1.获取成员变量们
//        * Field[] getFields():获取public修饰的成员变量
//        * Field getField(String name):获取指定名称的public修饰成员变量
//        * Field[] getDeclareFields():获取所有成员变量
//        * Field getDeclareField(String name):获取指定的成员变量

        Field[] fields = Person.getFields();
        System.out.println(fields.length);
        fields = Person.getDeclaredFields();
        System.out.println(fields.length);

//        流式遍历666
        Stream<Field> stream = Stream.of(fields);
        stream.forEach(System.out::println);


        Field field = Person.getDeclaredField("a");
        Person p = new Person();
        System.out.println(field);

//        violent reflection?
        field.setAccessible(true);

//        Field对象的set方法,Field是该类的一个变量,第一个参数是要设置的具体对象
        field.set(p, "名字");

//        get方法直接获取该对象此类型值
        Object value = field.get(p);
        System.out.println(value);


//        2.获取构造方法们
//        * Constructor<?>[] getConstructors()
//        * Constructor<T> getConstructor()
//        * Constructor<T>getDeclareConstructor()
//        * Constructor<?>getDeclareConstructors()

    }
}
