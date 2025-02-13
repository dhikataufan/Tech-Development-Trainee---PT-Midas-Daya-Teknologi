import java.util.*;

class Stack {
    private LinkedList<Character> stack;
    
    public Stack() {
        this.stack = new LinkedList<>();
    }
    
    public int push(char item) {
        stack.addLast(item);
        return stack.size();import java.util.LinkedList;
import java.util.Map;
import java.util.EmptyStackException;

class Stack {
    private LinkedList<Character> stack;
    
    public Stack() {
        this.stack = new LinkedList<>();
    }
    
    public int push(char item) {
        stack.addLast(item);
        return stack.size();
    }
    
    public char pop() {
        if (isEmpty()) throw new EmptyStackException();
        return stack.removeLast();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public char peek() {
        if (isEmpty()) throw new EmptyStackException();
        return stack.getLast();
    }
    
    public int length() {
        return stack.size();
    }
}

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack stack = new Stack();
        Map<Character, Character> matchingBrackets = Map.of(')', '(', '}', '{', ']', '[');

        for (char ch : s.toCharArray()) {
            if (matchingBrackets.containsValue(ch)) {
                stack.push(ch);
            } else if (matchingBrackets.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != matchingBrackets.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([])"));     // true
    }
}
    }
    
    public char pop() {
        if (isEmpty()) throw new EmptyStackException();
        return stack.removeLast();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public char peek() {
        if (isEmpty()) throw new EmptyStackException();
        return stack.getLast();
    }
    
    public int length() {
        return stack.size();
    }
}

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack stack = new Stack();
        Map<Character, Character> matchingBrackets = Map.of(')', '(', '}', '{', ']', '[');

        for (char ch : s.toCharArray()) {
            if (matchingBrackets.containsValue(ch)) {
                stack.push(ch);
            } else if (matchingBrackets.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != matchingBrackets.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([])"));     // true
    }
}
