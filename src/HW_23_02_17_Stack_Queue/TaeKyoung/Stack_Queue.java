package HW_23_02_17_Stack_Queue.TaeKyoung;
import java.io.*;
import java.util.*;

public class Stack_Queue {
    static Stack<Character> ch_stack = new Stack<>();
    static Queue<Character> ch_queue = new LinkedList<>();

    static void pushCharacter(char c){
        ch_stack.push(c);
    }
    static char popCharacter(){
        return ch_stack.pop();
    }
    static void enqueueCharacter(char c){
        ch_queue.add(c);
    }
    static char dequeueCharacter(){
        return ch_queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Stack_Queue p = new Stack_Queue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}

