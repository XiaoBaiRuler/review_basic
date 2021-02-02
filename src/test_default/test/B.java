package test_default.test;

/**
 * @Author xiaobai
 * @Date 2021/2/1 10:47
 * @Version 1.0
 */
public class B extends A{
    public void H(){
        this.aa = "1";
        this.bb = "2";
    }

    /**
     *  默认和protected，在同包的同类和同子类下都能正常访问
     */
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.aa);
        System.out.println(a.bb);
    }
}
