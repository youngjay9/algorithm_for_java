package array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayADT {

  private static Logger logger = LoggerFactory.getLogger(ArrayADT.class);

  public static void main(String[] args) {

    int size = 10;

    MyArray arr = new MyArray(size ,new int[size]);

    for (int i=0; i< 5; i++){
        arr.getArray()[i] = i;
    }

    arr.add(10);

    for (int i: arr.getArray()){
        logger.info("arr[{}]: {}", i, arr.getArray()[i]);
    }

    logger.info("arr size: {}", arr.getSize());


  }

}
