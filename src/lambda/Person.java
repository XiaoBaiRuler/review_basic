package lambda;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/2/13 10:52
 * @Version 1.0
 */
public class Person {

    String name;
    LocalDate birthday;

    public LocalDate getBirthday(){
        return birthday;
    }

    public  int compareByAge(Person a, Person b){
        return a.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        Person[] array = new Person[10];
        // 引用对象方法
        Arrays.sort(array, new Person()::compareByAge);
        // 引用类方法
        String[] strArray = {"a", "b", "c", "d"};
        Arrays.sort(strArray, String::compareToIgnoreCase);
    }
}
