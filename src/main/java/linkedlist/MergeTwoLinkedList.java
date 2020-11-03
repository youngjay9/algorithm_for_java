package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergeTwoLinkedList {

  private static Logger logger = LoggerFactory.getLogger(MergeTwoLinkedList.class);

  public static Node merge(Node first, Node second) {
    Node third = null;
    Node last;

    // step1.
    if (first.getData() < second.getData()) {
      third = first;
      last = first;
      first = first.getNext();
      last.setNext(null);
    } else {
      third = second;
      last = second;
      second = second.getNext();
      last.setNext(null);
    }

    // step2.
    while (first != null && second != null) {
      if (first.getData() < second.getData()) {
        last.setNext(first);
        last = first;
        first = first.getNext();
        last.setNext(null);
      } else {
        last.setNext(second);
        last = second;
        second = second.getNext();
        last.setNext(null);
      }

    }

    // step3.
    if (first != null) {
      last.setNext(first);
    } else {
      last.setNext(second);
    }

    return third;
  }

  public static void main(String[] args) {
    int[] dataArr = {3, 5, 7, 10, 11};

    int[] dataArr2 = {2, 6, 8, 9, 12};

    Node p = CreateLinkedList.createByArray(dataArr);

    Node q = CreateLinkedList.createByArray(dataArr2);

    // 模擬傳送兩個以排序過的 LinkedList
    Node mergedLinkedList = merge(p, q);

    DisplayLinkedList.displayForwardLinkedList(mergedLinkedList);

  }
}
