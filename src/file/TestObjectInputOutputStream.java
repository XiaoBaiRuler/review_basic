package file;

import java.io.*;

/**
 * @Author xiaobai
 * @Date 2021/2/8 18:50
 * @Version 1.0
 */
public class TestObjectInputOutputStream {
    public static void main(String[] args) throws IOException {
        Student student = new Student("xiaobai", 1);
        FileOutputStream fileOutputStream = new FileOutputStream("src/file/jiejie.txt");
        ObjectOutputStream objectOutputStream  = null;
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                assert objectOutputStream != null;
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileInputStream fileInputStream = new FileInputStream("src/file/jiejie.txt");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student students = (Student) objectInputStream.readObject();
            System.out.println(students.toString());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            fileInputStream.close();
            assert objectOutputStream != null;
            objectOutputStream.close();
        }
    }
}
