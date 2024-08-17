import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 4, 5, 4};

        // 1. 将数组排序为 {2, 3, 4, 4, 5, 9}
        Arrays.sort(array);
        System.out.println("升序排序: " + Arrays.toString(array));

        // 2. 将数组排序为 {4, 5, 4, 3, 2, 9}
        array = new int[]{9, 2, 3, 4, 5, 4};  // 重置数组
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("降序排序: " + Arrays.toString(array));
    }
}