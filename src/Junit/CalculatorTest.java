package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /*
        初始化方法：
            用于资源申请,所有测试方法在执行之前都会执行
            加上before注解
     */
    @Before
    public void init() {
        System.out.println("before");
    }

    /*
       释放资源方法：
            用于释放资源
     */
    @After
    public void close() {
        System.out.println("after");
    }
    /*
        测试test方法
     */
    @Test
    public void testAdd() {
        System.out.println("测试方法被执行");
    }
}
