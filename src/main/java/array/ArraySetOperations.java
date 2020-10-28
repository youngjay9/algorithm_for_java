package array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArraySetOperations {

  private static Logger logger = LoggerFactory.getLogger(ArraySetOperations.class);

  /**
   * set union
   *
   * @param arrA
   * @param arrB
   * @return
   */
  private static int[] union(int[] arrA, int[] arrB) {
    // arrA index
    int i = 0;
    // arrB index
    int j = 0;
    // mergedArr index
    int k = 0;

    int mergedArrLength = arrA.length + arrB.length;

    int[] mergedArr = new int[mergedArrLength];

    // 開始進入 merge
    while (i < arrA.length && j < arrB.length) {
      if (arrA[i] < arrB[j]) {
        mergedArr[k++] = arrA[i++];
      } else if (arrB[j] < arrA[i]) {
        mergedArr[k++] = arrB[j++];
      } else {
        mergedArr[k++] = arrA[i++];
        j++;
      }
    }

    // 補足 mergedArray 最後一個元素
    for (; i < arrA.length; i++) {
      mergedArr[k++] = arrA[i];
    }

    for (; j < arrB.length; j++) {
      mergedArr[k++] = arrB[j];
    }

    int[] result = new int[k];
    for (int counter = 0; counter < k; counter++) {
        result[counter] = mergedArr[counter];
    }

    return result;
  }

  /**
   * set intersection
   *
   * @param arrA
   * @param arrB
   * @return
   */
  private static int[] intersection(int[] arrA, int[] arrB) {
    // arrA index
    int i = 0;
    // arrB index
    int j = 0;
    // mergedArr index
    int k = 0;

    int mergedArrLength = arrA.length + arrB.length;

    int[] mergedArr = new int[mergedArrLength];

    // 開始進入 merge
    while (i < arrA.length && j < arrB.length) {
      if (arrA[i] < arrB[j]) {
        i++;
      } else if (arrB[j] < arrA[i]) {
        j++;
      } else if (arrA[i] == arrB[j]) {
        mergedArr[k++] = arrA[i++];
        j++;
      }
    }

    int[] result = new int[k];
    for (int counter = 0; counter < k; counter++) {
      result[counter] = mergedArr[counter];
    }

    return result;
  }

  /**
   * set difference
   *
   * @param arrA
   * @param arrB
   * @return
   */
  private static int[] difference(int[] arrA, int[] arrB) {
    // arrA index
    int i = 0;
    // arrB index
    int j = 0;
    // mergedArr index
    int k = 0;

    int mergedArrLength = arrA.length + arrB.length;

    int[] mergedArr = new int[mergedArrLength];

    // 開始進入 merge
    while (i < arrA.length && j < arrB.length) {
      if (arrA[i] < arrB[j]) {
        mergedArr[k++] = arrA[i++];
      } else if (arrB[j] < arrA[i]) {
        j++;
      } else {
        i++;
        j++;
      }
    }

    // 補足 mergedArray 最後一個元素
    for (; i < arrA.length; i++) {
      mergedArr[k++] = arrA[i];
    }

    int[] result = new int[k];
    for (int counter = 0; counter < k; counter++) {
      result[counter] = mergedArr[counter];
    }

    return result;
  }

  public static void main(String[] args) {

    // 已排序過的 a
    int[] a = {2, 6, 10, 15, 25};

    // 已排序過的 b
    int[] b = {3, 6, 7, 15, 20};

    logger.info("a array: {}", a);

    logger.info("b array: {}", b);

    int[] c = union(a, b);

    logger.info("union array: {}", c);

    int[] intersectionArray = intersection(a, b);

    logger.info("intersection Array: {}", intersectionArray);

    int[] differenceArray = difference(a, b);

    // A - B
    logger.info("difference Array: {}", differenceArray);

  }

}
