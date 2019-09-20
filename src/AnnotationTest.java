import java.lang.reflect.Method;

@Data(className = "domain.Person", methodName = "eat")
public class AnnotationTest {
    public static void main(String[] args) throws Exception{
        Class<AnnotationTest> cls = AnnotationTest.class;

        Data data = cls.getAnnotation(Data.class);

        String className = data.className();
        String methodName = data.methodName();

        Class cls2 = Class.forName(className);
        Object obj = cls2.newInstance();
        cls2.getMethod(methodName, String.class).invoke(obj,"  shit");
    }
}
