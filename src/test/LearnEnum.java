package test;

import java.util.EnumSet;

/**
 * @Author xiaobai
 * @Date 2021/2/2 21:12
 * @Version 1.0
 */
public class LearnEnum {
    public static void main(String[] args) {
        Color color = Color.RED;
        switch (color){
            case RED:
                System.out.println(Color.RED);break;
            case GREEN:
                System.out.println(Color.GREEN);break;
            case BLUE:
                System.out.println(Color.BLUE);break;
            default: break;
        }
        System.out.println(Food.Coffee.BLACK_COFFEE);
    }
    public enum Color {
        /**
         * 红，绿，蓝
         */
        RED, GREEN, BLUE
    }
}

interface Food{
    enum Coffee implements Food{
        /**
         * coffee
         */
        BLACK_COFFEE,DECAF_COFFEE,LATTE,CAPPUCCINO
    }
    enum Dessert implements Food{
        /**
         * food
         */
        FRUIT, CAKE, GELATO
    }
}

interface Behaviour{
    /**
     * 获取名字
     */
    void getName();
}

enum Signal implements Behaviour{

    /**
     * 红，绿，蓝
     */
    RED("红色", 1), GREEN("绿色", 2), BLUE("蓝色", 3);
    private String name;
    private int index;

    Signal(String name, int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public void getName() {
        System.out.println(this.name);
    }

    @Override
    public String toString() {
        return this.index + "_" + this.name;
    }


    public String getName(int index){
        for (Signal c : Signal.values()){
            if (c.index == index){
                return c.name;
            }
        }
        return null;
    }
}
