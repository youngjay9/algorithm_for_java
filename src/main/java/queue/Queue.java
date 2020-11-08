package queue;

public class Queue<T> {

  private int size;

  private int front;

  private int rear;

  private T[] Q;

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getFront() {
    return front;
  }

  public void setFront(int front) {
    this.front = front;
  }

  public int getRear() {
    return rear;
  }

  public void setRear(int rear) {
    this.rear = rear;
  }

  public T[] getQ() {
    return Q;
  }

  public void setQ(T[] q) {
    Q = q;
  }
}
