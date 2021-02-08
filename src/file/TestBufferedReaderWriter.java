package file;

import java.io.*;

/**
 * @Author xiaobai
 * @Date 2021/2/8 21:03
 * @Version 1.0
 */
public class TestBufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file/java.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("xiaobai:我是小白呀");
        bufferedWriter.newLine();
        bufferedWriter.write("没想到还可以换行");
        bufferedWriter.close();
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder builder = new StringBuilder();
        String str = null;
        while ((str = bufferedReader.readLine()) != null){
            builder.append(str);
        }
        System.out.println(builder.toString());

    }
}
