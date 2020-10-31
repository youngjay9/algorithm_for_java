package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountingNodesInLinkedList {

  private static Logger logger = LoggerFactory.getLogger(CountingNodesInLinkedList.class);

  private static int count(Node p) {
    int c = 0;

    while (p != null) {
      c++;
      p = p.getNext();
    }

    return c;
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

    logger.info("counting nodes in linked list: {}", count(first));


  }

}
