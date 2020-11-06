package thread.interrupt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockingTaskDemo {

  private static Logger logger = LoggerFactory.getLogger(thread.interrupt.BlockingTaskDemo.class);

  public static void main(String[] args) {
    Thread thread = new Thread(new BlockingTask());
    thread.start();

    try {
      logger.info("current thread: {} ready to sleep!!", Thread.currentThread().getName());
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    logger.info("current thread: {} is wake up, ready to interrupt another thread!!",
        Thread.currentThread().getName());
    thread.interrupt();
  }

  private static class BlockingTask implements Runnable {

    public void run() {
      try {
        Thread.sleep(500000);
      } catch (InterruptedException e) {
        logger.info("Exiting Blocking thread");
      }
    }
  }
}
