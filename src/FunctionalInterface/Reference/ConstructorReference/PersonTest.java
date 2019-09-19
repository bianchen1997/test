package FunctionalInterface.Reference.ConstructorReference;

//引用类的构造器产生Person实例
public class PersonTest {
//  定义一个方法，参数传递姓名和PersonBuilder方法，方法中通过姓名创建对象
    private static void personFromName(String str, PersonBuilder pb) {
        Person person = pb.createPerson(str);
        System.out.println(person.getName());

    }
    public static void main(String[] args) {
//      调用printName方法，方法的参数PersonBuilder接口是一个函数式接口，可传递lambda表达式
        personFromName("阿锟", str -> new Person(str));

//        lambda表达式已知
//        构造方法已知
//        创建对象已知

        personFromName("阿锟", Person::new);
    }
}
