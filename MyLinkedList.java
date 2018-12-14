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
    return true;
  }

  public String toString() {
    if (size == 0) {
      return "[]";
    }
    Node current = start;
    String f = "[";
    while (current != end) {
      f += current.getData() + ", ";
      current = current.next();
    }
    f += end.getData() + "]";
    return f;
  }


  public Integer get(int index) {
    Node current = start;
    while (index != 0) {
      current = current.next();
      index--;
    }
    return current.getData();
  }

}
