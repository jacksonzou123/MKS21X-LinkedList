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
    a.add(7);
    a.remove(3);
    System.out.println(a);
    MyLinkedList b = new MyLinkedList();
    b.add(8);
    b.add(9);
    System.out.println(b);
    a.extend(b);
    System.out.println("-------------");
    System.out.println(a);
    System.out.println(b);
    System.out.println(a.size());
  }
}
