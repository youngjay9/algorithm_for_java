package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcatenatingTwoLinkedList {

  private static Logger logger = LoggerFactory.getLogger(ConcatenatingTwoLinkedList.class);

  public static void concatingTwoLinkedList(Node p, Node q){
    // 注意 while 條件是 p.getNext(),讓 p 移動到最後一個 element
    while (p.getNext() != null){
       p = p.getNext();
    }

    // 讓 p 的最後一個 element 串接到 q
    p.setNext(q);
  }

  public static void main(String[] args) {
    int[] dataArr = {2, 9, 6, 8};

    int[] dataArr2 = {10, 4, 7};

    Node p = CreateLinkedList.createByArray(dataArr);

    Node q = CreateLinkedList.createByArray(dataArr2);

    concatingTwoLinkedList(p, q);

    DisplayLinkedList.displayForwardLinkedList(p);

  }
}
