package lambda;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author xiaobai
 * @Date 2021/2/13 0:11
 * @Version 1.0
 */
public class TestLambda {
    public static void main(String[] args) {
        // ->
        Runnable ru = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Runnable r = () -> System.out.println(Thread.currentThread().getName());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(16, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        PriorityQueue<Integer> priorityQueue1 =
                new PriorityQueue<Integer>(16, Comparator.reverseOrder());

        JButton show = new JButton("show");
        show.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello");
            }
        });
        show.addActionListener((e) -> System.out.println("hello"));
    }
}