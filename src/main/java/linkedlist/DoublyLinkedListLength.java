package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoublyLinkedListLength {

  private static Logger logger = LoggerFactory.getLogger(DoublyLinkedListLength.class);

  public static int length(Node p) {

    int length = 0;

    while (p != null) {
      length++;
      p = p.getNext();
    }

    return length;
  }

  public static void main(String[] args) {

    int[] dataArr = {2, 8, 3, 7, 12};

    Node p = CreateLinkedList.createDoublyLinkedListByArray(dataArr);

    logger.info("doubly linked list length: {}", length(p));

  }
}
