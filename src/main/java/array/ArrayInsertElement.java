package array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayInsertElement {

  private static Logger logger = LoggerFactory.getLogger(ArrayInsertElement.class);

  private static int[] resetArraySize(int[] arr) {
    int length = arr.length;

    int[] newArray = new int[length + 1];

    for (int i = 0; i < length; i++) {
      newArray[i] = arr[i];
    }

    return newArray;
  }

  /**
   * 將 element 按照順序插入 array 中
   * @param element
   * @param arr
   * @return
   */
  private static int[] insertElement(int element, int[] arr) {

    int originalLength = arr.length;

    arr = resetArraySize(arr);

    int i = originalLength - 1;

    // 關鍵：用 while loop 從最後面的元素去檢查是否大於 element
    while (arr[i] > element) {
      arr[i + 1] = arr[i];
      i--;
    }

    arr[i + 1] = element;

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {4, 8, 13, 16, 20, 25, 28, 33};

    int element = 18;

    logger.info("before insert: {}", arr);

    logger.info("insert element: {}", element);

    int[] result = insertElement(element, arr);

    logger.info("after insert: {}", result);
  }


}
