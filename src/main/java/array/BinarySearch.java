package array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {

  private static Logger logger = LoggerFactory.getLogger(BinarySearch.class);

  private static int searchKey(int l, int h, int mid, int[] arr, int key) {

    if (arr[mid] != key) {
      if (arr[mid] < key) {
        l = mid + 1;
        mid = (l + h) / 2;
        searchKey(l, h, mid, arr, key);
      } else if (arr[mid] > key) {
        h = mid - 1;
        mid = (l + h) / 2;
        searchKey(l, h, mid, arr, key);
      }
    }

    return mid;
  }


  public static void main(String[] args) {

    int[] arr = {5, 6, 7, 8, 12};

    int key = 8;

    // 最左邊 index
    int l = 0;

    // 最右邊 index
    int h = 4;

    int mid = (l + h) / 2;

    int result = searchKey(l , h, mid, arr, key);

    logger.info("result : {}", result);


  }
}
