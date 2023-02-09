// 작성자 : 하유미
// 작성일 : 23-02-09 17:44
//Complete this code or write your own from scratch
package Java_Map;
import java.util.*;

public class Yumi_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int phone_Number = sc.nextInt();
            map.put(name, phone_Number);
            sc.nextLine();
        }
        while (sc.hasNext()) {
            String sample = sc.nextLine();
            if(map.containsKey(sample)) {
                System.out.println(sample + "=" + map.get(sample));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
