package test_default;


import test_default.test.A;

/**
 * 不同包下，protected修饰的属性是可以访问的，但是默认的就不可以访问
 *
 * @Author xiaobai
 * @Date 2021/2/1 10:19
 * @Version 1.0
 */
public class C extends A {
    public void H(){
        this.aa = "";
        //编译出错
        //this.bb = "";
    }

    public static void main(String[] args) {
        A a = new A();
        //编译出错
        //a.aa = "1";
        //编译出错
        //a.bb = "2";
    }
}
