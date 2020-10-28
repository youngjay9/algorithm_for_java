package array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayRearrange {

  private static Logger logger = LoggerFactory.getLogger(ArrayRearrange.class);

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  /**
   * 將 array 中負整數排左邊，正整數排右邊
   *
   * @param arr
   */
  private static void reArrange(int[] arr) {

    int i = 0;

    int j = arr.length - 1;

    while (i < j) {
      while (arr[i] < 0) {
        i++;
      }

      while (arr[j] >= 0) {
        j--;
      }

      if (i < j) {
        swap(arr, i, j);
      }

    }

  }

  public static void main(String[] args) {

    int[] arr = {8, -3, 25, 10, 6, 11, -15, 2, -12, 4};

    logger.info("before arrange: {}", arr);

    reArrange(arr);

    logger.info("after arrange: {}", arr);

  }
}
