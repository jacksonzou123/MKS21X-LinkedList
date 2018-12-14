public class Driver{
  public static void main(String[] args) {
    MyLinkedList a = new MyLinkedList();
    System.out.println(a);
    a.add(5);
    a.add(3);
    a.add(23);
    a.add(54);
    a.add(6);
    a.add(2);
    a.add(41);
    a.add(34);
    a.add(1);
    a.add(44);
    System.out.println(a);
    System.out.println(a.get(4));
  }
}
