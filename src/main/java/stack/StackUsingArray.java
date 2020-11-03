package stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackUsingArray {

  private static Logger logger = LoggerFactory.getLogger(StackUsingArray.class);

  public static int peek(Stack stack, int index) {
    int x = -1;

    if (stack.getTop() - index < 0) {
      logger.info("invalid index");
    } else {
      x = stack.getS()[index];
    }

    return x;
  }

  public static boolean isEmpty(Stack stack) {
    if (stack.getTop() == -1) {
      return true;
    }

    return false;
  }

  public static boolean isFull(Stack stack) {
    if (stack.getTop() == stack.getSize() - 1) {
      return true;
    }

    return false;
  }

  /**
   * 將元素從 stack 取出
   *
   * @param st
   * @return
   */
  public int pop(Stack st) {
    int x = -1;

    // top: -1 代表 stack 為 empty, top: size - 1 代表 stack 為 full
    if (st.getTop() == -1) {
      logger.info("stack underflow!!");
    } else {
      x = st.getS()[st.getTop()];
      st.setTop(st.getTop() - 1);
    }

    return x;
  }

  /**
   * 將元素加入 stack
   *
   * @param st
   * @param x
   */
  public static void push(Stack st, int x) {
    // top: size - 1 代表 stack 為 full
    if (st.getTop() == st.getSize() - 1) {
      logger.info("stack overflow!!");
    } else {
      st.setTop(st.getTop() + 1);
      int[] arr = st.getS();
      arr[st.getTop()] = x;
    }
  }

  public static Stack createByIntegerArray(int size) {
    Stack stack = new Stack();
    stack.setSize(size);
    stack.setS(new int[size]);
    stack.setTop(-1);
    return stack;
  }

  public static void display(Stack stack) {
    int top = stack.getTop();
    for (int i = top; i > -1; i--) {
      logger.info("{}", stack.getS()[i]);
    }

    logger.info("\n");
  }

  public static void main(String[] args) {
    Stack stack = createByIntegerArray(5);

    push(stack, 10);
    push(stack, 20);
    push(stack, 30);
    push(stack, 40);
    push(stack, 50);

    display(stack);

    logger.info("peek stack index:2 {}", peek(stack, 2));

  }
}
