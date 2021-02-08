package file;

import java.io.*;

/**
 * @Author xiaobai
 * @Date 2021/2/8 20:20
 * @Version 1.0
 */
public class TestBufferedInputOutputStream{
    public static void main(String[] args) throws IOException {

        OutputStream out = new FileOutputStream("src/file/xiaobai.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
        try {
            for (int temp = 65; temp < 70; temp ++) {
                bufferedOutputStream.write(temp);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            bufferedOutputStream.close();
            out.close();
        }


        InputStream in = new FileInputStream("src/file/xiaobai.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
        try {
            int temp = 0;
            while ((temp = bufferedInputStream.read()) != -1){
                System.out.print(temp + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedInputStream.close();
            in.close();
        }
    }
}
