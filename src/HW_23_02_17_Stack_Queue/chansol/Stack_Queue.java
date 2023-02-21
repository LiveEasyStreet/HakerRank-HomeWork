package HW_23_02_17_Stack_Queue.chansol;

import java.util.*;

public class Stack_Queue {
    Stack<Character> st = new Stack<>();
    Queue<Character> qu = new LinkedList<>();

    public void pushCharacter(char st) {
        this.st.push(st);
    } // pushCharacter

    public void enqueueCharacter(char qu) {
        this.qu.add(qu);
    } // enqueueCharacter

    public char popCharacter() {
        return this.st.pop();
    } // popCharacter

    public char dequeueCharacter() {
        return this.qu.poll();
    } // dequeueCharacter

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Stack_Queue p = new Stack_Queue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c); // stack push
            p.enqueueCharacter(c); // queue enqueue
        } // enhanced for

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            } // if
        } // for

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );

        scan.close();
    } // main
} // end Stack_Queue