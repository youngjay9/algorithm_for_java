package stack;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParenthesisMatching {

  private static Logger logger = LoggerFactory.getLogger(ParenthesisMatching.class);

  private static Stack stack = new Stack();

  public static boolean isEmpty(Stack stack) {
    if (stack.getTop() == -1) {
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
  public static char pop(Stack st) {
    char x = '\0';

    // top: -1 代表 stack 為 empty, top: size - 1 代表 stack 為 full
    if (st.getTop() == -1) {
      logger.info("stack underflow!!");
    } else {
      x = st.getC()[st.getTop()];
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
  public static void push(Stack st, char x) {
    // top: size - 1 代表 stack 為 full
    if (st.getTop() == st.getSize() - 1) {
      logger.info("stack overflow!!");
    } else {
      st.setTop(st.getTop() + 1);
      char[] arr = st.getC();
      arr[st.getTop()] = x;
    }
  }

  /**
   * 用 stack 資料結構檢查括號是否有對應的開始跟結束
   *
   * @param exp
   * @return
   */
  public static boolean isBalance(char[] exp) {

    boolean result = false;

    // 設定 stack
    stack.setSize(exp.length);
    stack.setTop(-1);
    stack.setC(new char[exp.length]);

    for (int i = 0; i < exp.length; i++) {
      // 檢查過程中,遇到 '(', 放入 stack
      if (exp[i] == '(') {
        push(stack, exp[i]);
      }
      // 檢查過程中,遇到 ')'
      else if (exp[i] == ')') {
        //如果 stack 為 empty,則代表 top 已指向 -1, 此 exp 為錯的括號形式
        if (stack.getTop() == -1) {
          return false;

        }
        // 從 stack pop
        pop(stack);
      }
    }

    // 最後的 stack 必須為 empty, 此 exp 才是正確的形式
    if(isEmpty(stack)){
      result = true;
    }
    return result;
  }

  public static void main(String[] args) {
    String str = "((a+b)*(c+d))";
    char[] ch = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }

    logger.info("isBalance: {}", isBalance(ch));
  }

}
