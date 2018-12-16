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

  public Integer set(int index, Integer value) {
    Node current = start;
    while (index != 0) {
      current = current.next();
      index--;
    }
    Integer f = current.getData();
    current.setData(value);
    return f;
  }

  public boolean contains(Integer value) {
    Node current = start;
    while (current != end) {
      if (current.getData() == value) {
        return true;
      }
      current = current.next();
    }
    return end.getData() == value;
  }

  public int indexOf(Integer value) {
    Node current = start;
    int index = 0;
    while (current != end) {
      if (current.getData() == value) {
        return index;
      }
      index++;
      current = current.next();
    }
    if (end.getData() == value) {
      return index;
    }
    return -1;
  }

  public void add(int index, Integer value) {
    if (size() == index) {
      add(value);
    }
    else {
      Node next = start;
      while (index != 0) {
        next = next.next();
        index--;
      }
      Node previous = next.prev();
      Node current = new Node(value, next, previous);
      try {
        previous.setNext(current);
      }
      catch(NullPointerException e) {
        start = current;
      }
      next.setPrev(current);
      size++;
    }
  }
}
