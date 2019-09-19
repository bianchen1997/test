package FunctionalInterface.Reference.ThisReference;

/*
    通过this引用本类的成员方法
 */
public class Husband {
    public void buyHouse() {
        System.out.println("buy something");
    }

//    定义一个结婚方法,传递Richable接口
    public void marry(Richable r) {
        r.buy();
    }

//    定义一个高兴的方法
    public void soHappy() {
        marry(() -> {
            this.buyHouse();
        });

//        this引用成员方法
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
