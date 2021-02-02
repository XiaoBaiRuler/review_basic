package test;
import test_default.test.A;

/**
 * @Author xiaobai
 * @Date 2021/2/1 10:15
 * @Version 1.0
 */
public class LearnKey {

//    private final static A a = new A();

    public static void main(String[] args) {

//        //不能指向其他对象，但是对象的内容可以改变的
//        a.dd = "xiaobai";
//        System.out.println(a.dd);


    }
    static class Learn{
        public void said(){
            System.out.println("static修饰内部类");
        }
    }
}

