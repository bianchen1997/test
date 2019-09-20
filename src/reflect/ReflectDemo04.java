package reflect;

import domain.Person;

import java.lang.reflect.Method;
import java.util.stream.Stream;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception{
        Class cls = Person.class;
//        3.获取成员方法们
//        Method[] getMethods():所有公有方法，包括父类继承的
//        Method getMethod()

        Method  method = cls.getMethod("eat");
        Person person = new Person();
        method.invoke(person);

        method = cls.getMethod("eat", String.class);
        method.invoke(person, "shit");

//        Method[] getDeclareMethods():所有方法，不包括父类继承
//        Method getDeclareMethod()
        Method[] methods = cls.getMethods();
        for (Method method_ : methods) {
            System.out.println(method_.getName());
        }
        Stream<Method> stream = Stream.of(methods);
        stream.forEach(System.out::println);




    }
}
