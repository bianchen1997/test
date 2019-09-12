package IOAndProperties;

/*
    GBK->UTF-8
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConversionFormat {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("newFile.txt"), "utf-8");
        int len = 0;
        while ((len = isr.read())!= -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
