package recursive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class nCrUsingRecursion {

  private static Logger logger = LoggerFactory.getLogger(nCrUsingRecursion.class);

  /**
   * 利用帕斯卡三角形取得 recursive 的關係, 看 udemy 58 筆記.
    * @param n
   * @param r
   * @return
   */
  static  int c(int n, int r){
    if(r == 0 || n == r){
        return 1;
    }

    return c(n-1, r-1) + c(n-1, r);
  }

  public static void main(String[] args){
    logger.info("result: " + c(4, 3));
  }


}
