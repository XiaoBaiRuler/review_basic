package test;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/2/2 21:05
 * @Version 1.0
 */
public class LearnList {
    public static void main(String[] args) {
        int[] list1 = new int[10];
        int[] list2 = {1, 2, 4};
        int[][] list3 = {{1, 2}, {3, 4}};
        list1 = new int[]{1, 2, 4};
        //3
        System.out.println(list1.length);
        //[1, 2, 4]
        System.out.println(Arrays.toString(list2));
        //[[1, 2], [3, 4]]
        System.out.println(Arrays.deepToString(list3));
    }
}
