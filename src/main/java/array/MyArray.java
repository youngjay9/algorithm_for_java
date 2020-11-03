package array;

public class MyArray {

  private int[] array;

  private int size;


  public MyArray(int size, int[] array) {
    this.size = size;
    this.array = array;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }


  public int[] getArray() {
    return array;
  }

  public void setArray(int[] array) {
    this.array = array;
  }

  public void add(int item){
    if(array.length < size){
      array[size] = item;
      size++;
    }

  }
}
