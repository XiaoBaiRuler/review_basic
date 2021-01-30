/**
 * @Author xiaobai
 * @Date 2021/1/30 20:59
 * @Version 1.0
 */
public class LeanMethod {
    public static void main(String[] args) {
        LeanMethod leanMethod = new LeanMethod();
        System.out.println(leanMethod.learn(1));
        System.out.println(leanMethod.learn(0.1f));
        System.out.println(leanMethod.learn(1, 2));
        System.out.println(leanMethod.learn(1, 2, 3, 4, 5));
    }

    private int learn(int a){
        return -1;
    }

    private float learn(float a){
        return 0.1f;
    }

    private int learn(int... a){
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }

    private int learn(int a, int b){
        return 2;
    }
}

class Test{
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        System.out.println(child1.learn());
        Child4 child4 = new Child4();
        System.out.println(child4.learn(1));
    }
}

class Parent{
    private int learn(){
        System.out.println("parent的learn");
        return -1;
    }
}

class Child1 extends Parent {
    public int learn(){
        System.out.println("我改了访问权限");
        return -2;
    }
}

class Child2 extends Parent{
    private double learn(){
        System.out.println("我改了返回值类型");
        return 0.1d;
    }
}

class Child3 extends Parent{
    private int learn(){
        System.out.println("我改了实现逻辑");
        return -1;
    }
}

// 这个相当于重写 还是重载啊？？？
class Child4 extends Parent{
    public int learn(int a){
        System.out.println(a);
        return a;
    }
}

class Student extends Parent {
    private int learn(){
        System.out.println("student的learn");
        return -1;
    }
}