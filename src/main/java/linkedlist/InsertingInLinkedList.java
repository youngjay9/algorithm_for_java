package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertingInLinkedList {

  private static Logger logger = LoggerFactory.getLogger(InsertingInLinkedList.class);


  /**
   * 將 Node insert 至指定的位置(position 從 1 開始)
   *
   * @param p
   * @param position
   * @param data
   * @return
   */
  public static Node insertInSpecifiedPosition(Node p, int position, int data) {

    Node first = p;

    Node t = new Node();
    t.setData(data);

    if (position == 0) {
      t.setNext(first);
      first = t;
    } else {
      // 移動到第 position 個位置,也就是往前移動 (position - 1) 次
      for (int i = 0; i < position - 1; i++) {
        p = p.getNext();
      }

      // 移動到指定的位置後,開始 insert 新 Node
      t.setNext(p.getNext());
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
  private static Node insertBeforeFirstNode(Node p, int data) {
    Node first = p;

    Node t = new Node();
    t.setData(data);
    t.setNext(first);

    first = t;

    return first;
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

    logger.info("Before insert first node:\n");
    DisplayLinkedList.displayForwardLinkedList(first);

    int data = 13;
    logger.info("After insert data:{} before first node:\n", data);

    Node tmp = insertBeforeFirstNode(first, data);
    DisplayLinkedList.displayForwardLinkedList(tmp);

    data = 11;
    int position = 5;
    Node tmp2 = insertInSpecifiedPosition(tmp, position, data);
    logger.info("After insertInSpecifiedPosition data:{}, position:{} :\n", data, position);
    DisplayLinkedList.displayForwardLinkedList(tmp2);


  }

}
