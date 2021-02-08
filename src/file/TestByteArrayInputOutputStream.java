package file;

import java.io.*;
import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/2/8 14:22
 * @Version 1.0
 */
public class TestByteArrayInputOutputStream {
    public static void main(String[] args) throws IOException {

        byte[] bytes = "abcdefghijklmnopqrstuvwxyz".getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        int a = 0;
        while ((a = byteArrayInputStream.read()) != -1){
            System.out.print((char)a + " ");
        }
        byteArrayInputStream.close();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int ch = 97;
        while (ch < 123){
            byteArrayOutputStream.write(ch);
            ch ++;
        }
        System.out.println(byteArrayOutputStream.toString());
        byte[] newByte = byteArrayOutputStream.toByteArray();
        System.out.println(Arrays.toString(newByte));
    }

}
