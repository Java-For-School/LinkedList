import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(11);
    list.add(232);
    list.add(31232);
    
    int target = 1;

    System.out.printf("The list includes %d: %b\n", target, isExist(list, target));
    target = 6;
    System.out.printf("The list includes %d: %b\n", target, isExist(list, target));
    target = 6123;
    System.out.printf("The list includes %d: %b\n", target, isExist(list, target));
    target = 31232;
    System.out.printf("The list includes %d: %b\n", target, isExist(list, target));

  }
  private static boolean isExist(LinkedList<Integer> list, int target) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == target) return true;
    }

    return false;
  }
  
}
