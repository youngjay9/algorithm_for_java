package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReversingLinkedList {

  private static Logger logger = LoggerFactory.getLogger(ReversingLinkedList.class);


  /**
   * 透過遞迴的方式 reverse linkedlist
   * @param q
   * @param p
   * @return
   */
  public static void reverseByRecursive(Node q, Node p){

    Node first = p;

    if(p != null){
      // 1. 遞迴一直 calling 的部份
      reverseByRecursive(p, p.getNext());

      // 3. 遞迴在 calling 完以後 returning 的部份
      p.setNext(q);
    }
    else {
      // 2. 當 p 為 null 時,重新指定 first 的位置
      first = q;
    }
  }
  /**
   * 用往右 sliding 的方式去 reverse linkedlist
   * @param p
   * @return
   */
  public static Node reverseBySliding(Node p) {
    Node first = p;
    Node q = null;
    Node r = null;

    while (p != null) {
      //用下面 3 個 step 向右滑動
      r = q;
      q = p;
      p = p.getNext();

      // 利用中間項的 q 指向前一項 element 達到 reverse 的效果
      q.setNext(r);
    }

    first = q;

    return first;
  }

  /**
   * 用暫存 array 的方式去 reverse LinkedList
   *
   * @param p
   * @param size
   */
  public static void reverse(Node p, int size) {
    Node first = p;

    // 暫存 Linked List element 的陣列
    int[] tmpArr = new int[size];

    int i = 0;

    while (p != null) {
      tmpArr[i++] = p.getData();
      p = p.getNext();
    }

    if (tmpArr.length < 0) {
      return;
    }

    // 將 tmpArr 的 index 減 1
    i--;
    // 重新將 p 指向 first
    p = first;

    while (p != null) {
      p.setData(tmpArr[i--]);
      p = p.getNext();
    }

  }

  public static void main(String[] args) {
    int[] dataArr = {2, 4, 6, 8, 10, 12};

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

    logger.info("before reverse:\n");

    DisplayLinkedList.displayForwardLinkedList(first);

    logger.info("after reverse:\n");

    reverse(first, dataArr.length);

    DisplayLinkedList.displayForwardLinkedList(first);

    Node tmp = reverseBySliding(first);

    logger.info("after reverseBySliding:\n");

    DisplayLinkedList.displayForwardLinkedList(tmp);

    reverseByRecursive(null, tmp);

    logger.info("after reverseByRecursive:\n");

    DisplayLinkedList.displayForwardLinkedList(tmp);

  }

}
