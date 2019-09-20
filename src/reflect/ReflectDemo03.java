package reflect;

import domain.Person;

import java.lang.reflect.Constructor;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {

        Class cls = Person.class;
//        获取构造方法们
//        Constructor类同样有violent reflection setAccessible
//        * Constructor<?>[] getConstructors()
//        * Constructor<T> getConstructor()
//        * Constructor<T>getDeclareConstructor()
//        * Constructor<?>getDeclareConstructors()

        Constructor constructor = cls.getConstructor(String.class, int.class,
                String.class, String.class, String.class, String.class);

        System.out.println(constructor);

        Object person = constructor.newInstance("阿锟", 22, "帅吗？",
                "awesome", "beautiful", "amazing");
        System.out.println(person);

        constructor = cls.getConstructor();
        person = constructor.newInstance();
        System.out.println(person);

        Object person2 = cls.newInstance();
        System.out.println(person == person2);
    }
}
