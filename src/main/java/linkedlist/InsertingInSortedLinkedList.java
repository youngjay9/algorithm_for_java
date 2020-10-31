package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertingInSortedLinkedList {

  private static Logger logger = LoggerFactory.getLogger(InsertingInSortedLinkedList.class);

  public static Node insert(Node p, int data) {
    Node first = p;

    Node q = null;

    while (p != null) {
      if (p.getData() > data) {
        Node t = new Node();
        t.setData(data);

        q.setNext(t);
        t.setNext(p);
      }

      q = p;
      p = p.getNext();
    }

    return first;
  }

  public static void main(String[] args) {
    int[] dataArr = {3, 7, 9, 15, 20};

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

    logger.info("Before insert:\n");
    DisplayLinkedList.displayForwardLinkedList(first);

    int newData = 18;

    logger.info("After insert {}:\n", newData);
    Node tmp = insert(first, newData);
    DisplayLinkedList.displayForwardLinkedList(tmp);
  }
}
