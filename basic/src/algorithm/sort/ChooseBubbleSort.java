package algorithm.sort;



public class ChooseBubbleSort extends BasicSort {

    @Override
    public int[] sort(int[] arr) {
        int count = 0;
        
        int len = arr.length - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println("count : " + count);
        return arr;
    }
}
