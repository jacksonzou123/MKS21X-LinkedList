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
    a.add(4,3);
    System.out.println(a);
    System.out.print(a.get(0));
    System.out.print(a.get(a.size()-1));
  }
}
