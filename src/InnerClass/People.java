package InnerClass;

/**
 * @Author xiaobai
 * @Date 2021/2/6 13:24
 * @Version 1.0
 */
public class People {
    public People(){

    }
}

class Man{
    public Man(){}
    public People getWoman(){
        class Woman extends People{
            int age = 0;
        }
        return new Woman();
    }
}