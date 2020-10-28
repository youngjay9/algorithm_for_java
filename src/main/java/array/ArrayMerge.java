package array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayMerge {

  private static Logger logger = LoggerFactory.getLogger(ArrayMerge.class);

  private static int[] mergeTwoArray(int[] arrA, int[] arrB) {
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
      if(arrA[i] < arrB[j]){
        mergedArr[k++] = arrA[i++];
      }
      else {
        mergedArr[k++] = arrB[j++];
      }
    }

    // 補足 mergedArray 最後一個元素
    for(;i<arrA.length;i++){
      mergedArr[k++] = arrA[i];
    }

    for(;j<arrB.length;j++){
      mergedArr[k++] = arrB[j];
    }

    return mergedArr;
  }

  public static void main(String[] args) {

    // 已排序過的 a
    int[] a = {3, 8, 16, 20, 25};

    // 已排序過的 b
    int[] b = {4, 10, 12, 22, 23};

    logger.info("a array: {}", a);

    logger.info("b array: {}", b);

    int[] c = mergeTwoArray(a, b);

    logger.info("merged array: {}", c);

  }
}
