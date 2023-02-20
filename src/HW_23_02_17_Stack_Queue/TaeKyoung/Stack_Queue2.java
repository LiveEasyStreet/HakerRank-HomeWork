package HW_23_02_17_Stack_Queue.TaeKyoung;

import java.util.*;

public class Stack_Queue2 {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Deque<Character> stack_test = new ArrayDeque<>();
            boolean isfinish = true;
            // enhanced for로 안바꾼 이유 : input.toCharArray는 데이터 공간 차지
            //      s.split("")은 string으로 받으니까 이거 써도 되는데 난 ==으로 비교하고싶음
            //      s.chars().forEach(c -> ... ); 솔직히 얘는 하고나서 알음
            for (int i = 0; i < input.length(); i++) {
                char temp = input.charAt(i);
                //아래에 해당되면 넣음
                if (temp == '{' || temp == '(' || temp == '[') {
                    stack_test.push(temp);
                }
                // 아래에 해당되면
                else if (temp == ')' || temp == '}' || temp == ']') {
                    //일단 비어있는지 확인 후
                    if (!stack_test.isEmpty()) {
                        //비어있지 않으면 꺼낸뒤에
                        char temp2 = stack_test.pop();
                        //꺼낸거랑 매칭 되는지 확인
                        // 원래 -로 연산할까 했는데 알아보기 쉽게 함
                        if (((temp2 == '[' && temp == ']') || (temp2 == '(' && temp == ')') || (temp2 == '{' && temp == '}'))) {
                            ;
                            ;
                        } else {
                            isfinish = false;
                            break;
                        }
                    } else {
                        isfinish = false;
                        break;
                    }
                }
            }
            if (stack_test.isEmpty() && isfinish) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
