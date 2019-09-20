package Annotation;

import java.lang.annotation.Annotation;

//注释注解
@MyAnnotation(className = "domain.Person", methodName = "eat")
public class Test {
    public static void main(String[] args) {

//        获取注解标注的类字节码文件
        Class<Test> cls = Test.class;

//        获取注解对象（注解接口的实现类）
        MyAnnotation ma = cls.getAnnotation(MyAnnotation.class);

//        可以手动创建此类
/*

        MyAnnotation ms = new MyAnnotation() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return null;
            }

            @Override
            public String className() {
                return null;
            }

            @Override
            public String methodName() {
                return null;
            }
        };
*/


//        调用注解对象中的定义方法，获取返回值
        String className = ma.className();
        String methodName = ma.methodName();



    }
}
