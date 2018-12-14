public class Driver{
  public static void main(String[] args) {
    MyLinkedList a = new MyLinkedList();
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
    System.out.println(a.contains(5));
    System.out.println(a.contains(23));
    System.out.println(a.contains(44));
    System.out.println(a.contains(-1));
  }
}
