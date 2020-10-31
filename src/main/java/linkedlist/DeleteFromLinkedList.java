package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteFromLinkedList {

  private static Logger logger = LoggerFactory.getLogger(DeleteFromLinkedList.class);

  public static Node deleteBySpecifiedPosition(Node p, int position) {
    Node first = p;

    Node q = null;

    if(position == 1){
      first = p.getNext();
    }else {
      // 將 q 移到 position 的前一項
      // 將 p 移到 position 那一項
      for (int i = 0; i < position - 1; i++) {
        q = p;
        p = p.getNext();
      }

      q.setNext(p.getNext());
    }

    return first;
  }

  public static void main(String[] args) {
    int[] dataArr = {8, 3, 9, 7, 6};

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

    logger.info("Before delete:\n");
    DisplayLinkedList.displayForwardLinkedList(first);

    int delPosition = 5;
    logger.info("After delete position:{}\n", delPosition);
    Node tmp = deleteBySpecifiedPosition(first, delPosition);
    DisplayLinkedList.displayForwardLinkedList(tmp);

  }
}
