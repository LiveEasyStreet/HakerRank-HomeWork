package HW_23_02_17_Stack_Queue.jungwon;

import java.util.*;

public class JungWon1 {

    Stack<Character> st = new Stack<>();

    public void pushCharacter(char c) {
        st.push(c);
    }

    public char popCharacter() {
        return st.pop();
    }

    Queue<Character> qu = new LinkedList<>();

    public void enqueueCharacter(char c) {
        qu.add(c);
    }

    public char dequeueCharacter() {
        return qu.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        JungWon1 p = new JungWon1();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

}

