package test;

import test_default.C;

/**
 * @Author xiaobai
 * @Date 2021/2/3 21:14
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 父类的引用指向子类对象
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.shout();
        animal2.shout();
    }
}
