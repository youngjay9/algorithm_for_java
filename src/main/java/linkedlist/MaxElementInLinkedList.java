package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaxElementInLinkedList {

  private static Logger logger = LoggerFactory.getLogger(MaxElementInLinkedList.class);

  private static int max(Node p) {
    int max = Integer.MIN_VALUE;

    int data = 0;

    while (p != null) {

      data = p.getData();

      if (data > max) {
        max = data;
      }

      p = p.getNext();
    }

    return max;
  }

  public static void main(String[] args) {
    int[] dataArr = {2, 8, 3, 7, 12, 9};

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

    logger.info("Max element in linked list: {}", max(first));


  }
}
