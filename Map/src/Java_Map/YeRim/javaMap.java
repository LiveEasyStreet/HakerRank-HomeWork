package src.Java_Map.YeRim;

import java.util.*;
import java.io.*;

public class javaMap {
    public static void main(String[] argh) {
        Map<String, Integer> hash = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            hash.put(name, phone);
            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            if (hash.containsKey(s)) {
                System.out.println(s + "=" + hash.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
