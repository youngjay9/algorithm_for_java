package queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueueUsingLinkedList {

  private static Logger logger = LoggerFactory.getLogger(QueueUsingLinkedList.class);

  // 指向 Queue 的第一個新增 element
  private static Node front = null;

  // 指向 Queue 的最後新增的 element
  private static Node rear = null;

  public static void display() {
    Node p = front;
    while (p != null) {
      logger.info("data: {}", p.getData());
      p = p.getNext();
    }
  }

  public static int deQueue() {
    int x = -1;

    if (front == null) {
      logger.info("Queue is empty!!");
    } else {
      // 先將 p 指向 front
      Node p = front;

      // 將 front 往前移動
      front = front.getNext();

      x = p.getData();
    }

    return x;
  }

  public static void enQueue(int x) {
    Node t = new Node();
    if (t == null) {
      logger.info("Heap is full");
    } else {
      t.setData(x);
      t.setNext(null);
      // 此 Queue 為 empty, 指定 front. rear 為 t
      if (front == null) {
        front = t;
        rear = t;
      }
      // 此 Queue 不為 empty, 指定 rear 為 t
      else {
        rear.setNext(t);
        rear = t;
      }
    }
  }


  public static void main(String[] args) {
    enQueue(10);
    enQueue(20);
    enQueue(30);
    enQueue(40);
    enQueue(50);

    logger.info("deQueue: {}", deQueue());
    logger.info("deQueue: {}", deQueue());
    logger.info("deQueue: {}", deQueue());
    logger.info("deQueue: {}", deQueue());
    logger.info("deQueue: {}", deQueue());
    logger.info("deQueue: {}", deQueue());



  }
}
