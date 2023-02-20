package HW_23_02_17_Stack_Queue.chansol;

import java.util.*;

public class Queue_Stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String input = sc.next();
            Deque<String> dq = new ArrayDeque<>();

            for(int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if('(' == c || '{' == c || '[' == c) {
                    dq.push(input);
                } else {
                    if(dq.isEmpty()) {
                        dq.push(input);
                        break;
                    }
                    dq.pop();
                } // if else
            } // for

            if(dq.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            } // if-else
        } // while

        sc.close();
    } // main
} // end Queue_Stack