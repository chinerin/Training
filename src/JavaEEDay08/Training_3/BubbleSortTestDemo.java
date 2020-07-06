package javaEEDay08.Training_3;

/**
 * @PackageName:JavaEEDay08.Training_3
 * @ClassName:BubbleSortTestDemo
 * @Description: BubbleSort
 * @author: CK
 * @data: 2020/7/5 9:46
 */
public class BubbleSortTestDemo {
    public static void main(String[] args) {
        int[] arr = {54, 84, 65, 74, 2, 46};
        BubbleSortTestDemo bstd = new BubbleSortTestDemo();
        bstd.sorter(arr);
    }

    /**
     * 排序
     *
     * @param arr
     */
    private void sorter(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        showArray(arr);
    }

    private void showArray(int[] arr) {
        for (int i : arr) {
            System.out.print(">" + i);
        }
        System.out.println();
    }

}
