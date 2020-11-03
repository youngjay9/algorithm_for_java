package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteFromDoublyLinkedList {

  private static Logger logger = LoggerFactory.getLogger(DeleteFromDoublyLinkedList.class);

  public static int length(Node p) {

    int length = 0;

    while (p != null) {
      length++;
      p = p.getNext();
    }

    return length;
  }


  public static Node deleteBySpecifiedPosition(Node p, int position) {
    Node first = p;

    if (position < 1 || position > length(p)) {
      return null;
    }

    if (position == 1) {
      first = p.getNext();
    } else {
      for (int i = 0; i < position - 1; i++) {
        p = p.getNext();
      }

      // 重新指定刪除項前面 element 的 next 為刪除項的 next
      p.getPrev().setNext(p.getNext());

      // 重新指定刪除項後面 element 的 prev 為刪除項的 prev
      if (p.getNext() != null) {
        p.getNext().setPrev(p.getPrev());
      }
    }

    return first;
  }


  public static void main(String[] args) {
    int[] dataArr = {6, 9, 3, 7, 2};

    Node p = CreateLinkedList.createDoublyLinkedListByArray(dataArr);

    int position = 5;

    Node tmp = deleteBySpecifiedPosition(p, position);

    DisplayDoublyLinkedList.display(tmp);
  }
}
