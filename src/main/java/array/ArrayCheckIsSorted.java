package array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayCheckIsSorted {
  private static Logger logger = LoggerFactory.getLogger(ArrayCheckIsSorted.class);

  private static boolean checkArrayIsSorted(int[] array){
    int length = array.length;

    for (int i=0; i< length - 1; i++){
      if(array[i] > array[i+1]){
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    int[] arr = {4, 8, 13, 16, 20, 25, 28, 33};

    boolean result = checkArrayIsSorted(arr);

    logger.info("result: {}", result);
  }
}
