package queue;

public class Queue<T> {

  private int size;

  private T front;

  private T rear;

  private T[] Q;

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public T getFront() {
    return front;
  }

  public void setFront(T front) {
    this.front = front;
  }

  public T getRear() {
    return rear;
  }

  public void setRear(T rear) {
    this.rear = rear;
  }

  public T[] getQ() {
    return Q;
  }

  public void setQ(T[] q) {
    Q = q;
  }
}
