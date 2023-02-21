package HW_23_02_17_Stack_Queue.Yumi;

import java.util.*;
class JavaStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            Deque<Character> deque = new ArrayDeque<>();
            boolean isBalanced = true;

            for(int i = 0; i < input.length(); i++) {
                char leng = input.charAt(i);

                if(leng == '{' || leng == '(' || leng == '[') {
                    deque.push(leng);
                } else if(leng == '}' || leng == ')' || leng == ']') {
                    if(!deque.isEmpty()) {
                        char leng2 = input.charAt(i);
                        if((leng2 == '}' && deque.peek() == '{') || (leng2 == ')' && deque.peek() == '(') || (leng2 == ']' && deque.peek() == '[')) {
                            deque.pop();
                        } else {
                            isBalanced = false;
                            break;
                        }
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
            }
            if(deque.isEmpty() && isBalanced) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
