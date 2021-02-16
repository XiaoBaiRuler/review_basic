package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/2/14 21:45
 * @Version 1.0
 */
public class TestReflect {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取类的对象
        String str = "hello reflect";

        // 1. 通过对象的getClass
        Class<?> class1 = str.getClass();
        // 2. 通过类的class属性
        Class<?> class2 = String.class;
        // 3. 通过Class的静态方法forName
        Class<?> class3 = Class.forName("java.lang.String");

        // 获取类中的所有字段

        // 1. getFields():获取所有public字段，包括父类字段
        Field[] fields1 = class1.getFields();
        // 2. getDeclaredFields():获取所有字段，但不包括父类字段
        Field[] fields2 = class1.getDeclaredFields();

        // 获取类中的所有构造方法

        Class<?> class4 = Class.forName("reflect.Employee");
        // 1. getConstructors():获取所有公共构造方法
        Constructor<?>[] constructors1 = class4.getConstructors();
        // 2. getDeclaredConstructors():获取所有构造方法
        Constructor<?>[] constructors2 = class4.getDeclaredConstructors();
        // 3. getConstructor(): 获取单个构造方法
        Constructor<?> constructor1 = class4.getConstructor(int.class, int.class, int.class, int.class, String.class);
        // 4. 当方法为private时，需要setAccessible(true)，才能使用
        Constructor<?> constructor2 = class4.getDeclaredConstructor(String.class);
        constructor2.setAccessible(true);
        Employee employee1 = (Employee) constructor2.newInstance("xiaobai");
        Employee employee2 = (Employee) constructor1.newInstance(1, 1, 1, 1, "xiaobai");

        // 获取类中的所有非构造方法

        // 1. getMethods()：获取所有公共方法，包含父类方法
        Method[] methods1 = class4.getMethods();
        // 2. getDeclaredMethods(): 获取当前类所有方法
        Method[] methods2 = class4.getDeclaredMethods();
        // 3. getMethod(): 根据方法名和参数类型获取单个方法实例
        Method method = class4.getMethod("setB", int.class);
        method.invoke(employee1, 10);
        System.out.println(Employee.getB());
    }
}
