import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> integers = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      integers.add(sc.nextInt());
    }

    
    Stack<Integer> stack = new Stack<>();
    stack.push(integers.get(0));
    int count = 0;
    System.out.println("\n\n\n");

    for (int j = 1; j < integers.size(); j++) {
      if (stack.peek() == integers.get(j)) {
        System.out.println(stack.size());
        stack.push(integers.get(j));
        if (count == 0) count = count + 2; else count++;
      } else {
        while (count != 0) {
          stack.pop();
          count--;
        }
        System.out.println(stack.size());
        stack.push(integers.get(j));
        stack = cleanup(stack);
      }
    }
    stack = cleanup(stack);
    System.out.println(stack.size());
  }

  public static Stack<Integer> cleanup(Stack<Integer> stack) {
    while (stack.size() > 1) {
      int x = stack.pop();
      if (stack.peek() == x) stack.pop(); else {
        stack.push(x);
        break;
      }
    }
    return stack;
  }
}
// 2 3 2 3 3 3 2 3 3 2
// 3 2 3 2 2
