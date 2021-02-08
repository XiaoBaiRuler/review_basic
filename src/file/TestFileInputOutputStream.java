package file;

import java.io.*;
import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/2/8 12:13
 * @Version 1.0
 */
public class TestFileInputOutputStream {
    public static void main(String[] args) throws IOException {
        // 1. 通过文件路径-(创建文件对象)-建立输入流
        InputStream inputStream = new FileInputStream("src/file/xiaobai.txt");
        // 2. 创建文件对象-建立输入流
        File file = new File("src/file/xiaobai.txt");
        InputStream fileInputStream = new FileInputStream(file);
        fileInputStream.close();
        //读取一个字节: 5
        System.out.println(inputStream.read());
        //读取一个字节数组: 返回大小:4[32, 50, 32, 50](32为空格)
        byte[] bytes = new byte[4];
        System.out.println(inputStream.read(bytes));
        System.out.println(Arrays.toString(bytes));
        //从输入流中读取off到len之间的数据到字节数组: 返回大小:4[54, 54, 54, 54]
        System.out.println(inputStream.read(bytes, 0, 4));
        System.out.println(Arrays.toString(bytes));
        inputStream.close();

        // 1. 通过文件路径-(创建文件对象)-建立输出流
        OutputStream outputStream = new FileOutputStream("src/file/xiaobai.txt");
        outputStream.close();
        // 2. 创建文件对象-建立输出流
        File file1 = new File("src/file/xiaobai.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        // 读入一个字节(新流会覆盖原来的信息): 6
        fileOutputStream.write(54);
        // 读入一个字节数组(新流会覆盖原来的内容): 6666
        byte[] bytes1 = {54, 54, 54, 54};
        fileOutputStream.write(bytes1);
        // 数组off到len之间的数据读入到输出流(新流会覆盖原来的内容): 66
        fileOutputStream.write(bytes1, 0, 2);
        fileOutputStream.close();
    }
}
