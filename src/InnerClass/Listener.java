package InnerClass;

/**
 * @Author xiaobai
 * @Date 2021/2/6 13:32
 * @Version 1.0
 */
public abstract class Listener {
    /**
     * hello
     */
    public abstract void hello();
}
class TestListener{
    public static void main(String[] args) {
        System.out.println(new Listener(){
            @Override
            public void hello(){
                System.out.println("hello world");
            }
        });
    }
}
