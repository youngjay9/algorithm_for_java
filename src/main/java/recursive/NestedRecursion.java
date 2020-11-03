package recursive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NestedRecursion {

  private static Logger logger = LoggerFactory.getLogger(NestedRecursion.class);

  private static int f(int n) {
    if (n > 100) {
      return n - 10;
    }
    return f(f(n + 11));
  }

  public static void main(String[] args) {
    int result;
    result = f(95);
    logger.info("result: " + result);

  }
}
