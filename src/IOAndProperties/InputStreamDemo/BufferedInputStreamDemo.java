package IOAndProperties.InputStreamDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./a.txt"));
        ) {
            while (bis.read()!=-1) {
                System.out.println((char)bis.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
