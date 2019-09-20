package FunctionalInterfaceAndReference.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void method(String name, Consumer<String> cs) {
        cs.accept(name);
    }

    public static void main(String[] args) {
        method("孟祥宇",
                name-> {
                    System.out.println(name);

                    StringBuilder sb = new StringBuilder(name);
                    System.out.println(sb.reverse());
                });
    }
}
