package test;

import test_default.test.A;

/**
 * @Author xiaobai
 * @Date 2021/2/3 21:03
 * @Version 1.0
 */
public class Child extends Father{

    final int c =  1;

    @Override
    public void said() {
        System.out.println(b);
        show();
        System.out.println(c);
        super.said();
    }
}
