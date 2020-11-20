package algorithm.sort;

import java.util.Arrays;

public abstract class BasicSort {
    

    public static final String ASCEND = "ascend";
    public static final String DESCEND = "descend";
    public static final String DISARRAY = "disarray";
    
    private int[] ascend = {11, 22, 33, 44, 55, 66, 66, 77, 88, 99};
    private int[] descend = {99, 88, 77, 66, 66, 55, 44, 33, 22, 11};
    private int[] disarray = {66, 88, 11, 77, 22, 66, 55, 44, 99, 33};
    
    BasicSort() {
    
    }
    
    abstract int[] sort(int[] arr);
    
    int[] getArray(String type) {
        int[] arr;
        switch (type) {
            case ASCEND:
                arr = ascend;
                break;
            case DESCEND:
                arr = descend;
                break;
            case DISARRAY:
                arr = disarray;
                break;
            default:
                arr = ascend;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
