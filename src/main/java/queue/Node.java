package queue;

public class Node {

  private int data;

  private Node prev;

  private Node next;

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getPrev() {
    return prev;
  }

  public void setPrev(Node prev) {
    this.prev = prev;
  }

  @Override
  public String toString() {
    return "Node{" +
        "data=" + data +
        '}';
  }
}
