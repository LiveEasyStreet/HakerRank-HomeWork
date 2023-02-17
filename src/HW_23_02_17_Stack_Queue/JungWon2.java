package HW_23_02_17_Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


// 풀긴 풀었는데 이렇게 푸는거 아닌거같은 느낌...

class JungWon2 {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        a:while (sc.hasNext()) {

            Deque<Character> stack = new ArrayDeque<>();

            int n1 = 0;
            int n2 = 0;
            int n3 = 0;

            String input = sc.nextLine();

            for (int i = 0; i < input.length(); i++) {
                stack.add(input.charAt(i));
            }

            for (int i = 0; i < input.length(); i++) {
                char temp = stack.poll();

                switch (temp) {
                    case '(' : n1++; break;
                    case '[' : n2++; break;
                    case '{' : n3++; break;
                    case ')' : n1--; break;
                    case ']' : n2--; break;
                    case '}' : n3--; break;
                }

                if (n1 < 0 || n2 < 0 || n3 < 0) {
                    System.out.println("false");
                    continue a;
                }
            }

            System.out.println(((n1 + n2 + n3) == 0) ? "true" : "false");

        }
        sc.close();

    }
}
