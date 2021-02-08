package file;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @Author xiaobai
 * @Date 2021/2/8 19:54
 * @Version 1.0
 */
public class TestFilterInputOutputStream {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("src/file/xiaobai.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            int temp = Integer.MAX_VALUE;
            dataOutputStream.writeInt(temp);
            dataOutputStream.write('a');
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            dataOutputStream.close();
            outputStream.close();
        }


        InputStream fileInputStream = new FileInputStream("src/file/xiaobai.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        try {
            System.out.println(dataInputStream.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            dataInputStream.close();
            fileInputStream.close();
        }
    }
}
