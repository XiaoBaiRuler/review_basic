package InnerClass;

/**
 * @Author xiaobai
 * @Date 2021/2/6 13:51
 * @Version 1.0
 */
public class StaticInner {
    private int a = 1;
    private static int b = 2;
    private final int c = 3;

    public static class Inner{
        public void say(){
            //访问不了a/c，可以访问b
            System.out.println("hello");
        }
    }
}
