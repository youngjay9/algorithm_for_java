package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisplayLinkedList {

  private static Logger logger = LoggerFactory.getLogger(DisplayLinkedList.class);

  private static void displayBackForwardLinkedList(Node p){
      if(p != null){
        displayBackForwardLinkedList(p.getNext());
        logger.info("data: {}", p.getData());
      }
  }

  public static void displayForwardLinkedList(Node p) {
    while (p != null) {
      logger.info("data: {}", p.getData());
      p = p.getNext();
    }
  }

  public static void main(String[] args) {

    int[] dataArr = {2, 8, 3, 7, 12};

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

    logger.info("display linked list:\n");
    displayForwardLinkedList(first);

    logger.info("display back forward linked list:\n");
    displayBackForwardLinkedList(first);

  }

}
