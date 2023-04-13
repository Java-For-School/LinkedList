import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(3);

    int index = findElement(list, 1);
    System.out.println(index);
    index = findElement(list, 2);
    System.out.println(index);
  }
  private static int findElement(LinkedList<Integer> list, int target) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == target) return i;
    }
    
    return -1;
  }
}
