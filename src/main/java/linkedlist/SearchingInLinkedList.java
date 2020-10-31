package linkedlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchingInLinkedList {

  private static Logger logger = LoggerFactory.getLogger(SearchingInLinkedList.class);

  /**
   * 將之前 search 過的 key element 移到第一項, 減少下次搜尋的時間 說明參考 168. improve linear search 的 note
   *
   * @return
   */
  private static Node enhancedLinearSearch(Node p, int key) {
    Node first = p;
    Node q = null;

    while (p != null) {
      // 如果找到 key element, 將 key element 移到第一項
      if(p.getData() == key){
        q.setNext(p.getNext());// 將 q 的 next 指向 key element 的下一項
        p.setNext(first); // 將 key element 的下一項指向 first
        first = p; // 重新指定 first 為 key element
      }

      q = p;
      p = p.getNext();
    }

    return first;
  }

  private static Node linearSearch(Node p, int key) {
    Node result = null;

    while (p != null) {
      if (p.getData() == key) {
        return p;
      }

      p = p.getNext();
    }

    return result;
  }

  public static void main(String[] args) {
    int[] dataArr = {2, 8, 3, 7, 12, 9};

    Node temp;

    Node first = new Node();
    first.setData(dataArr[0]);

    Node last = first;

    for (int i = 1; i < dataArr.length; i++) {
      temp = new Node();
      temp.setData(dataArr[i]);
      last.setNext(temp);
      last = temp;
    }

    int key = 12;

    Node tmp = linearSearch(first, key);

    logger.info("linear search by key:{} node: {}", key, tmp.getData());


    logger.info("before enhanced linear search:\n");
    DisplayLinkedList.displayForwardLinkedList(first);

    Node tmp2 = enhancedLinearSearch(first, key);

    logger.info("after enhanced linear search:\n");
    DisplayLinkedList.displayForwardLinkedList(tmp2);

    key = 9;
    Node tmp3 = enhancedLinearSearch(tmp2, key);

    logger.info("after second enhanced linear search key:{}\n", key);
    DisplayLinkedList.displayForwardLinkedList(tmp3);

  }

}
