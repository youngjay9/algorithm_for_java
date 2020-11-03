package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisplayCircularLinkedList {

  private static Logger logger = LoggerFactory.getLogger(DisplayCircularLinkedList.class);

  public static void display(Node p){
     Node head = p;

     do {
       logger.info("data: {}", p.getData());
       p = p.getNext();
     }while (p != head);
  }

  public static void main(String[] args) {

    int[] dataArr = {8, 3, 9, 6, 2};

    Node first = CreateLinkedList.createCircularLinkedListByArray(dataArr);

    display(first);
  }
}
