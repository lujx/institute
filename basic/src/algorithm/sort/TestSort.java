package algorithm.sort;

import java.util.Arrays;

public class TestSort {
    

    public static void main(String[] args) {
        ChooseBubbleSort chooseBubbleSort = new ChooseBubbleSort();
        int[] order = chooseBubbleSort.getArray(ChooseBubbleSort.DESCEND);
        order = chooseBubbleSort.sort(order);
        System.out.println(Arrays.toString(order));

        order = chooseBubbleSort.sort(chooseBubbleSort.getArray(ChooseBubbleSort.ASCEND));
        System.out.println(Arrays.toString(order));
    
        order = chooseBubbleSort.sort(chooseBubbleSort.getArray(ChooseBubbleSort.DISARRAY));
        System.out.println(Arrays.toString(order));
    }
}
