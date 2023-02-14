package HW_23_02_10_MAP.Java_Map.TaeKyoung;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        Map<String, String> DB_map = new HashMap<>();
        for (int i = 0; i < cnt; i++) {
            String temp_key = sc.nextLine();
            String temp_val = sc.nextLine();
            DB_map.put(temp_key, temp_val);
        }
        while (sc.hasNext()) {
            String temp_tst = sc.nextLine();
            if (DB_map.containsKey(temp_tst)) {
                System.out.println(temp_tst + "=" + DB_map.get(temp_tst));
            } else {
                System.out.println("Not found");
            }
        }

        sc.close();
    }
}
