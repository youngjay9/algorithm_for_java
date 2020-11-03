package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseDoublyLinkedList {

  private static Logger logger = LoggerFactory.getLogger(ReverseDoublyLinkedList.class);

  public static Node reverse(Node p) {

    Node first = p;

    Node tmp = null;

    while (p != null) {
      tmp = p.getNext();
      p.setNext(p.getPrev());
      p.setPrev(tmp);

      p = p.getPrev();

      if (p!= null && p.getNext() == null) {
        first = p;
      }
    }

    return first;
  }

  public static void main(String[] args) {
    int[] dataArr = {10, 20, 30, 40, 50};

    Node p = CreateLinkedList.createDoublyLinkedListByArray(dataArr);

    DisplayDoublyLinkedList.display(p);

    Node tmp = reverse(p);

    logger.info("after revers:\n");

    DisplayDoublyLinkedList.display(tmp);

  }
}
