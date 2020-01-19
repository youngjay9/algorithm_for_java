package prime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

  private static Logger logger = LoggerFactory.getLogger(App.class);

  private static int[] primes = {2, 3, 5, 7};

  /**
   * 檢查該數是否為質數
   * @param num
   * @return
   */
  private static boolean chkNumIsPrime(int num) {
    boolean result = false;

    for(int p: primes){
      if(num == p){
        result = true;
        break;
      }
      else{
        int mod = num % p;
        if(mod > 0){
          result = true;
        }
        else if(mod == 0){
          result = false;
          break;
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {

    for (int i = 0; i < 31; i++) {
        if(i == 0 || i ==1){
          continue;
        }

        if(chkNumIsPrime(i)){
          logger.info("prime:"+i);
        }
    }
  }

}
