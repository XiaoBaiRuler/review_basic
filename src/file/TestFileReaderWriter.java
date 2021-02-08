package file;

import java.io.*;

/**
 * @Author xiaobai
 * @Date 2021/2/8 20:52
 * @Version 1.0
 */
public class TestFileReaderWriter {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("src/file/java.txt");
        String s = "我是小白呀";
        // 刚写入时还是会覆盖原来的
        writer.append(s);
        writer.append("???");
        // 如果没有刷新，也没有关闭流的话 数据是不会写入文件的
        writer.flush();
        writer.close();

        Reader reader = new FileReader("src/file/java.txt");
        int len = 0;
        // 我是小白呀???
        while ((len = reader.read()) != -1){
            System.out.print((char) len);
        }
        reader.close();
    }
}
