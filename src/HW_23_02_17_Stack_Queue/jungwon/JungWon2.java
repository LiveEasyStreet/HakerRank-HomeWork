package HW_23_02_17_Stack_Queue.jungwon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class JungWon2 {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            Deque<Character> stack = new ArrayDeque<>();

            boolean tempBool = true;

            String input = sc.nextLine();

            for (int i = 0; i < input.length(); i++) {

                char temp = input.charAt(i);
                if (temp == '(' || temp == '[' || temp == '{') {
                    stack.push(temp);
                    continue;
                }

                if (stack.size() == 0) {
                    tempBool = false;
                    break;
                }

                char temp2 = stack.pop();
                if (temp == ')' & temp2 != '(') {
                    tempBool = false;
                    break;
                }
                if (temp == ']' & temp2 != '[') {
                    tempBool = false;
                    break;
                }
                if (temp == '}' & temp2 != '{') {
                    tempBool = false;
                    break;
                }

            }

            if (stack.size() > 0) {
                tempBool = false;
            }

            System.out.println(tempBool);

        }
        sc.close();

    }
}
