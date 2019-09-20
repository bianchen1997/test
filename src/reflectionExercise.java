import java.io.InputStream;
import java.util.Properties;

public class reflectionExercise {
    public static void main(String[] args) throws Exception{
//      创建Properties对象
        Properties properties = new Properties();

//      获取类加载器
        ClassLoader classLoader = reflectionExercise.class.getClassLoader();

//      类加载器当输入流？？？
        InputStream is = classLoader.getResourceAsStream("prop.properties");

//      读取文件到Properties对象中
        properties.load(is);

//      获取类名和方法名
        String className = (String)properties.get("className");
        String methodName = (String)properties.get("methodName");

//      装载类进内存
        Class cls = Class.forName(className);

//      创建实例
        Object o = cls.newInstance();

//      调用方法
        cls.getMethod(methodName, String.class).invoke(o, "臭狗屎");

    }
}
