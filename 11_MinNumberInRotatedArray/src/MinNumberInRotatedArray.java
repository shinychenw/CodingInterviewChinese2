/**
 * @ClassName MinNumberInRotatedArray
 * @Description TODO
 * @Author yuchenwang
 * @Date 2019-04-24 10:48
 * @Version 1.0
 **/
public class MinNumberInRotatedArray {
    public MinNumberInRotatedArray() {
    }

    public int find(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
//        if(array.length == 1) { return array[0];}
        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        while (array[left] >= array[right]) {
            if (right - left <= 1) {
                mid = right;
                break;
            }
            mid = (left + right) / 2;
            if (array[left] == array[mid] && array[mid] == array[right]) {
                mid = ++left;
                right--;
            } else if (array[left] <= array[mid]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return array[mid];
    }

    public static void main(String[] args) {
        MinNumberInRotatedArray minNumberInRotatedArray = new MinNumberInRotatedArray();
        int[] array1 = {3, 4, 5, 1, 2};
        int[] array2 = {2, 0, 1, 2, 2, 2, 2};
        int[] array3 = {0};
        int min = minNumberInRotatedArray.find(array3);
        System.out.println(min);
    }
}
