package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoveDuplicatesFromLinkedList {

  private static Logger logger = LoggerFactory.getLogger(RemoveDuplicatesFromLinkedList.class);

  public static Node removeDuplicates(Node p) {
    Node first = p;
    Node q = p.getNext();

    while (q != null) {
      // 前後沒有重複的項目, 繼續往前移動 p 跟 q
      if (p.getData() != q.getData()) {
        p = q;
        q = q.getNext();
      }
      // 前後有重複的項目,將第二項刪除
      else {
        p.setNext(q.getNext());
        q = q.getNext();
      }
    }

    return first;
  }

  public static void main(String[] args) {
    int[] dataArr = {3, 3, 5, 8, 8, 8};

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
    DisplayLinkedList.displayForwardLinkedList(first);

    logger.info("After remove:\n");

    Node tmp = removeDuplicates(first);

    DisplayLinkedList.displayForwardLinkedList(tmp);

  }
}
