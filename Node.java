public class Node{
  private int data;
  private Node next;
  private Node previous;

  public Node(int i, Node n, Node p) {
    setData(i);
    setNext(n);
    setPrev(p);
  }

  public Node next() {
    return next;
  }

  public Node prev() {
    return prev;
  }

  public void setNext(Node other) {
    next = other;
  }

  public void setPrev(Node other) {
    previous = other;
  }

  public Integer getData() {
    return data;
  }

  public Integer setData(Integer i) {
    data = i;
  }

}
