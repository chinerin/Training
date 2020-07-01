package JavaEEDayTraining01.Training_1;

/**
 * @PackageName:JavaEEDayTraining01.Training_1
 * @ClassName:bubbleSort
 * @Description: 排序练习
 * @author: CK
 * @data: 2020/7/1 14:52
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 5, 9, 3};
        bubbleSortMethod(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    /**
     *  冒泡
     * @param arr
     */
    public static void bubbleSortMethod(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j + 1, j);
                }
            }
        }
    }

    /**
     * 交换位置
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
