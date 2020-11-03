package recursive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreeRecursion {

  private static Logger logger = LoggerFactory.getLogger(ThreeRecursion.class);

  private static void fun(int n) {
    if (n > 0) {
      logger.info("n:" + n);
      fun(n - 1);
      fun(n - 1);
    }
  }


  public static void main(String[] args) {
    int x = 5;
    fun(3);
  }
}
