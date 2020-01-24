package recursive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HanoiTower {

  private static Logger logger = LoggerFactory.getLogger(HanoiTower.class);

  private static void hanoi(int n, char a, char b, char c){
    if(n >0){
      hanoi(n-1, a, c, b);

      logger.info("{} -> {}", a, b);

      hanoi(n-1, c, b, a);
    }
  }

  public static void main(String[] args){
    hanoi(2, 'a', 'b', 'c');
  }

}
