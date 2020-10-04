package recursive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticGlobal {

  private static Logger logger = LoggerFactory.getLogger(StaticGlobal.class);

  private static int fun(int n){
     if (n > 0){
       return fun( n-1) + n;
     }
     return 0;
  }


  public static void main(String[] args){
    int x = 5;
    logger.info("fun(5): {}", fun(x));
  }
}
