package IOAndProperties;

/*
    对集合进行序列化和反序列化
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise {
    public static void main(String[] args) throws Exception{
        List<Person> list = new ArrayList<>();
        list.add(new Person("阿锟1", 1));
        list.add(new Person("阿锟2", 2));
        list.add(new Person("阿锟3", 3));
        list.add(new Person("阿锟4", 4));
        list.add(new Person("阿锟5", 5));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Exercise.txt"));
        Iterator<Person> iterator = list.iterator();

        oos.writeObject(list);

        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Exercise.txt"));
        list = (ArrayList<Person>)ois.readObject();

        iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        ois.close();
    }
}
