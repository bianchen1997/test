package StreamAndReference;


import java.util.ArrayList;
import java.util.List;

public class DemoArrayListNames {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();

        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        ArrayList<String> two = new ArrayList<>();

        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        ArrayList<String> list1 = new ArrayList<>();
        for (String s : one) {
            if(s.length() == 3)
                list1.add(s);
        }

        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0; i < 3; i++)
            list2.add(list1.get(i));
        //一队处理完毕


        ArrayList<String> list3 = new ArrayList<>();
        for (String s : two) {
            if(s.startsWith("张"))
                list3.add(s);
        }

        ArrayList<String> list4 = new ArrayList<>();
        for (int i = 2; i < list3.size(); i++) {
            list4.add(list3.get(i));
        }

        ArrayList<String> list5 = new ArrayList<>();
        for (String s : list4) {
            list2.add(s);
        }

        ArrayList<Person> people = new ArrayList<>();
        list2.forEach(name -> people.add(new Person(name)));

        people.forEach(person -> System.out.println(person.toString()));
    }
}
