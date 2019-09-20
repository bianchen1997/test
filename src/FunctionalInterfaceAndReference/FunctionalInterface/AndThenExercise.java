package FunctionalInterfaceAndReference.FunctionalInterface;

import java.util.function.Consumer;

public class AndThenExercise {
    public static void main(String[] args) {
        String[] arrays = new String[] {
                "王建锟 男",
                "贺鑫 女",
                "许程飞 女"
        };

        andThenMethod(arrays, str-> System.out.print("姓名:" + str.split(" ")[0] + " "), str-> System.out.println("性别:" + str.split(" ")[1]));
    }

    private static void andThenMethod(String[] arrays, Consumer<String> con1, Consumer<String> con2) {
        for (String array : arrays) {
            con1.andThen(con2).accept(array);
        }
    }
}
