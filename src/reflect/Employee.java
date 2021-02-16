package reflect;

/**
 * @Author xiaobai
 * @Date 2021/2/16 11:34
 * @Version 1.0
 */
public class Employee extends Person{
    private final static int a = 1;
    private static int b;
    private int c;
    int d;
    protected int e;
    public int f;

    public Employee(int c, int d, int e, int f, String name) {
        super(name);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    private Employee(String name){
        super(name);
    }

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Employee.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }
}
