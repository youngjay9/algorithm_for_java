package thread.interrupt;

import java.math.BigInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LongComputationTaskDemo {

  private static Logger logger = LoggerFactory.getLogger(LongComputationTaskDemo.class);

  public static void main(String[] args) {
    Thread thread = new Thread(
        new LongComputationTask(new BigInteger("20000"), new BigInteger("1000000")));

    thread.start();
    thread.interrupt();
  }

  private static class LongComputationTask implements Runnable {

    private BigInteger base;

    private BigInteger power;

    public LongComputationTask(BigInteger base, BigInteger power) {
      this.base = base;
      this.power = power;
    }

    private BigInteger pow(BigInteger base, BigInteger power) {
      BigInteger result = BigInteger.ONE;

      for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i.add(BigInteger.ONE)) {
        if(Thread.currentThread().isInterrupted()){
          logger.info("permanently interrupted!!");
          return BigInteger.ZERO;
        }
        result = result.multiply(base);
      }
      return result;
    }

    public void run() {
      logger.info("{}^{} = {}", base, power, pow(base, power));
    }
  }
}
