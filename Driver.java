public class Driver{
  public static void main(String[] args) {
    MyLinkedList a = new MyLinkedList();
    a.add(0);
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);
    a.add(6);
    System.out.println(a);
    a.add(0,10);
    System.out.println(a);
    System.out.println(a.size());
    System.out.println(a.contains(5));
  }
}
