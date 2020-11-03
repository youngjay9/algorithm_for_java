package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisplayDoublyLinkedList {

  private static Logger logger = LoggerFactory.getLogger(DisplayDoublyLinkedList.class);

  public static void display(Node p) {
    while (p != null) {
      logger.info("data: {}", p.getData());
      p = p.getNext();
    }
    logger.info("\n");
  }

  public static void main(String[] args) {

    int[] dataArr = {2, 8, 3, 7, 12};

    Node p = CreateLinkedList.createDoublyLinkedListByArray(dataArr);

    display(p);


  }
}
