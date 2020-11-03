package stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackUsingLinkedList {

  private static Logger logger = LoggerFactory.getLogger(StackUsingLinkedList.class);

  private static Node top = null;

  /**
   * 每一次 push 就是將 element 放在 LinkedList 最前面
   *
   * @param x
   */
  public static void push(int x) {

    Node newNode = new Node();

    if (newNode == null) {
      logger.info("stack is full\n");
    }

    newNode.setData(x);
    newNode.setNext(top);
    top = newNode;
  }

  public static void display(){
    Node p = top;
    while (p != null){
      logger.info("{}", p.getData());
      p = p.getNext();
    }
  }

  /**
   * 每一次 pop 回傳 top 指向 element 的 data
   * @return
   */
  public static int pop() {
    int x = -1;

    if (top == null) {
      logger.info("stack is empty\n");
      return x;
    }

    x = top.getData();
    top = top.getNext();

    return x;
  }


  public static void main(String[] args) {

    push(10);
    push(20);
    push(30);

    display();

    logger.info("pop:{}", pop());
    logger.info("pop:{}", pop());
    logger.info("pop:{}", pop());
    logger.info("pop:{}", pop());

  }

}
