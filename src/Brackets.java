import java.util.Stack;

public class Brackets implements CheckText {
  public Boolean check (String text) {
    // Create stack for saving brackets
    Stack<Character> stack = new Stack<>();
    
    if (!text.contains("(")) return false;

    // Go through each character in the string
    for (char c : text.toCharArray()) {
      // If it is an opening bracket, add it to the stack
      if (c == '(') {
        stack.push(c);
      }
      // If it's a closing bracket
      else if (c == ')') {
        // If the stack is empty, the closing bracket has no corresponding opening bracket
        if (stack.isEmpty()) {
          return false;
        }
        // We remove the top element from the stack since we found a matching pair
        stack.pop();
      }
    }

    // If the stack is empty after the iteration completes, then all brackets have a corresponding pair
    return stack.isEmpty();
  }
}
