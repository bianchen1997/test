package Annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class CalculatorTest {
    public static void main(String[] args) throws IOException {
//        获取具体对象，用于后面反射获取方法
        Calculator calculator = new Calculator();
//        也可以这样获取，但因为要创建具体对象运行测试
//        Method[] methods = Calculator.class.getDeclaredMethods();

//        获取字节码文件
        Class cls = calculator.getClass();
        Method[] methods = cls.getDeclaredMethods();

        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        int bug = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    bug++;
                    bw.write("bug" + bug + ": ");
                    bw.write(method.getName() + "异常");
                    bw.newLine();
                    bw.write(e.getCause().getMessage());
                    bw.newLine();
                    bw.write(e.getCause().getClass().getSimpleName());
                }
            }
        }
        bw.close();
    }
}
