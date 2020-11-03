package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertingInDoublyLinkedList {

  private static Logger logger = LoggerFactory.getLogger(InsertingInDoublyLinkedList.class);

  public static int length(Node p) {

    int length = 0;

    while (p != null) {
      length++;
      p = p.getNext();
    }

    return length;
  }


  /**
   * 將 Node insert 至指定的位置(position 從 1 開始)
   *
   * @param p
   * @param position
   * @param data
   * @return
   */
  public static Node insertInSpecifiedPosition(Node p, int position, int data) {

    if(position <0 || position > length(p)){
      return p;
    }

    Node first = p;

    Node t = new Node();
    t.setData(data);

    if (position == 0) {
      t.setNext(first);
      first.setPrev(t);
      first = t;
    } else {
      // 移動到第 position 個位置,也就是往前移動 (position - 1) 次
      for (int i = 0; i < position - 1; i++) {
        p = p.getNext();
      }

      // 移動到指定的位置後,開始 insert 新 Node
      t.setPrev(p);
      t.setNext(p.getNext());
      if (p.getNext() != null) {
        p.getNext().setPrev(t);
      }
      p.setNext(t);
    }

    return first;
  }


  /**
   * 將新的 node insert 在第一個 Node 之前
   *
   * @param p
   * @param data
   * @return
   */
  public static Node insertBeforeFirstNode(Node p, int data) {
    Node first = p;

    Node t = new Node();
    t.setData(data);
    t.setNext(first);
    t.setPrev(null);

    first.setPrev(t);

    first = t;

    return first;
  }

  public static void main(String[] args) {
    int[] dataArr = {2, 8, 3, 7, 12};

    Node p = CreateLinkedList.createDoublyLinkedListByArray(dataArr);

    Node tmp = insertBeforeFirstNode(p, 1);

    logger.info("after insertBeforeFirstNode:\n");

    DisplayDoublyLinkedList.display(tmp);

    int position = 4;

    int data = 9;

    logger.info("after insertInSpecifiedPosition position:{} data:{}", position, data);

    Node tmp2 = insertInSpecifiedPosition(tmp, position, data);

    DisplayDoublyLinkedList.display(tmp2);
  }
}
