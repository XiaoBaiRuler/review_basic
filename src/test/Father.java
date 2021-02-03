package test;

/**
 * @Author xiaobai
 * @Date 2021/2/3 21:02
 * @Version 1.0
 */
public class Father {
    private int a = 1;
    public int b = 2;
    final int c = 3;

    public final void show(){
        System.out.println("hello");
    }

    public void said(){
        System.out.println("what is your name?");
    }
}
