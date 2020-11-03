package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertInCircularLinkedList {

  private static Logger logger = LoggerFactory.getLogger(InsertInCircularLinkedList.class);

  public static void main(String[] args) {
    int[] dataArr = {8, 3, 9, 6, 2};

    Node first = CreateLinkedList.createCircularLinkedListByArray(dataArr);

    int position = 4;

    int newData = 7;

    Node newNode = InsertingInLinkedList.insertInSpecifiedPosition(first, position, newData);

    logger.info("after insert data: {} in position:{}", newData, position);

    DisplayCircularLinkedList.display(newNode);
  }
}
