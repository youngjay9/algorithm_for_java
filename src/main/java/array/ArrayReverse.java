package array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayReverse {

  private static Logger logger = LoggerFactory.getLogger(ArrayReverse.class);

  private static int[] reverseArray(int[] array) {
    int[] result = new int[array.length];

    for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
      result[i] = array[j];
    }

    return result;
  }

  private static int[] reverseBySwap(int[] array) {
    int temp = 0;

    for (int i = 0, j = array.length - 1; i < j; i++, j--) {
      temp = array[i];
      array[i] = array[j];
      array[j] = temp;

    }

    return array;
  }

  public static void main(String[] args) {

    int[] arr = {8, 3, 9, 15, 6, 10, 7, 2, 12, 4};

    logger.info("before reverse: {}", arr);

    int[] result = reverseArray(arr);

    logger.info("after reverseArray: {}", result);

    int[] result2 = reverseBySwap(arr);

    logger.info("after reverseBySwap: {}", result2);

  }

}
