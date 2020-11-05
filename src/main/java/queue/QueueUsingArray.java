package queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueueUsingArray {

  private static Logger logger = LoggerFactory.getLogger(QueueUsingArray.class);

  public static void display(Queue<Integer> queue) {

    for (int i = queue.getFront() + 1; i < queue.getRear(); i++) {
        logger.info("{}", queue.getQ()[i]);
    }

  }

  public static int deQueue(Queue<Integer> queue) {
    int x = -1;

    if (queue.getFront() == queue.getRear()) {
      logger.info("Queue is Empty");
    } else {
      queue.setFront(queue.getFront() + 1);
      x = queue.getQ()[queue.getFront()];
    }

    return x;
  }

  /**
   * 插入元素至 queue
   *
   * @param queue
   * @param x
   */
  public static void enQueue(Queue<Integer> queue, int x) {

    if (queue.getRear() == queue.getSize() - 1) {
      logger.info("Queue is full");
    } else {
      // 將 readr 往後移一格, 指向資料放置的地方
      queue.setRear(queue.getRear() + 1);
      queue.getQ()[queue.getRear()] = x;
    }
  }

  public static void main(String[] args) {
    Queue<Integer> queue = new Queue<Integer>();
    queue.setSize(7);
    queue.setFront(-1);
    queue.setRear(-1);
    queue.setQ(new Integer[queue.getSize()]);

    enQueue(queue, 1);
    enQueue(queue, 2);
    enQueue(queue, 3);
    enQueue(queue, 4);
    enQueue(queue, 5);

    display(queue);

//    logger.info("deQueue:{}", deQueue(queue));
//    logger.info("deQueue:{}", deQueue(queue));
//    logger.info("deQueue:{}", deQueue(queue));

  }
}
