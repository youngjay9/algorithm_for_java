package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SumOfAllElementsInLinkedList {

  private static Logger logger = LoggerFactory.getLogger(SumOfAllElementsInLinkedList.class);

  private static int sum(Node p) {
    int s = 0;

    while (p != null) {
      s += p.getData();
      p = p.getNext();
    }

    return s;
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

    logger.info("sum of elements in linked list: {}", sum(first));
  }

}
