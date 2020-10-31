package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckLinkedListIsSorted {

  private static Logger logger = LoggerFactory.getLogger(CheckLinkedListIsSorted.class);

  public static boolean isSorted(Node p) {
    boolean result = true;

    int minValue = Integer.MIN_VALUE;

    while (p != null) {

      if (p.getData() < minValue) {
        result = false;
        break;
      } else {
        minValue = p.getData();
        p = p.getNext();
      }

    }

    return result;
  }

  public static void main(String[] args) {
    int[] dataArr = {3, 5, 8, 9, 16};

    Node temp;

    Node first = new Node();
    first.setData(dataArr[0]);

    Node last = first;

    for (int i = 1; i < dataArr.length; i++) {
      temp = new Node();
      temp.setData(dataArr[i]);
      last.setNext(temp);
      last = temp;
    }
    DisplayLinkedList.displayForwardLinkedList(first);

    boolean isSorted = isSorted(first);

    logger.info("Is sorted: {}", isSorted);

  }

}
