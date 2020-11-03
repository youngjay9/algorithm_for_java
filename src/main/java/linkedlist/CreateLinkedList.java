package linkedlist;

public class CreateLinkedList {

  public static Node createDoublyLinkedListByArray(int[] dataArr) {

    Node first = new Node();
    first.setData(dataArr[0]);
    first.setPrev(null);

    Node last = first;

    Node temp;
    for (int i = 1; i < dataArr.length; i++) {
      temp = new Node();
      temp.setData(dataArr[i]);
      temp.setPrev(last);
      last.setNext(temp);
      last = temp;
    }

    return first;
  }

  public static Node createCircularLinkedListByArray(int[] dataArr) {
    Node first = new Node();
    first.setData(dataArr[0]);

    Node last = first;

    Node temp;
    for (int i = 1; i < dataArr.length; i++) {
      temp = new Node();
      temp.setData(dataArr[i]);
      last.setNext(temp);
      last = temp;
      if (i == dataArr.length - 1) {
        last.setNext(first);
      }
    }

    return first;
  }

  public static Node createByArray(int[] dataArr) {

    Node first = new Node();
    first.setData(dataArr[0]);

    Node last = first;
    Node temp;

    for (int i = 1; i < dataArr.length; i++) {
      temp = new Node();
      temp.setData(dataArr[i]);
      last.setNext(temp);
      last = temp;
    }

    return first;
  }

}
