package HW_23_02_17_Stack_Queue.chansol;

import java.util.*;

public class Queue_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String input = sc.next();
            Deque<Character> dq = new ArrayDeque<>();
            boolean isTrue = true;

            if(input.length() % 2 > 0) {
                System.out.println("false");
                continue;
            } // if

            for(int i = 0; i < input.length(); i++) {
                char pushCh = input.charAt(i);

                if('(' == pushCh || '{' == pushCh || '[' == pushCh) {
                    dq.push(pushCh);
                } else if(')' == pushCh || '}' == pushCh || ']' == pushCh) {
                    if(!dq.isEmpty()) {
                        char popCh = dq.pop();

                       if(popCh == '(' && pushCh != ')') {
                           isTrue = false;
                           break;
                       } else if(popCh == '{' && pushCh != '}') {
                           isTrue = false;
                           break;
                       } else if(popCh == '[' && pushCh != ']') {
                           isTrue = false;
                           break;
                       } // if-else
                    } else {
                        isTrue = false;
                        break;
                    } // if-else
                } // if-else
            } // for

            System.out.println(isTrue);
        } // while

        sc.close();
    } // main
} // end Queue_Stack