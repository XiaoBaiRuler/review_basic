package InnerClass;

/**
 * 外部类
 * @Author xiaobai
 * @Date 2021/2/4 11:04
 * @Version 1.0
 */
public class Outer {
    private int a = 1;
    final int b = 1;
    Inner inner = new Inner();

    public void hello(){
        inner.hello();
    }

    /**
     * 成员内部类
     */
    private class Inner{
        public void hello(){
            System.out.println(a + b);
        }
    }
}


class Test{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.hello();
    }
}
