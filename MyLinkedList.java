public class MyLinkedList{
  private int size;
  private Node start;
  private Node end;

  public MyLinkedList() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(Integer value) {
    if (size()==0){
      start = new Node(value, null, null);
      end = start;
    }
    else {
      Node current = new Node(value,null,end);
      end.setNext(current);
      end = current;
    }
    size++;
  }

  public String toString() {
    return "";
  }
}
