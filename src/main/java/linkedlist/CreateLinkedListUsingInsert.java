package linkedlist;

public class CreateLinkedListUsingInsert {

  public static void main(String[] args) {

    Node first = null;

    first = InsertingInLinkedList.insertInSpecifiedPosition(first, 0, 8);

    InsertingInLinkedList.insertInSpecifiedPosition(first, 1, 3);

    InsertingInLinkedList.insertInSpecifiedPosition(first, 2, 6);

    InsertingInLinkedList.insertInSpecifiedPosition(first, 3, 9);

    DisplayLinkedList.displayForwardLinkedList(first);



  }
}
