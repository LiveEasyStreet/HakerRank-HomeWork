package src.Two_String.WonGyoon;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    public static String twoStrings(String s1, String s2) {
        char[] array1 = s1.trim().toCharArray();
        char[] array2 = s2.trim().toCharArray();
        Map<Character , Integer> map = new HashMap<>();

        if (!(s1.trim().isEmpty()) && !(s2.trim().isEmpty())) {
            for (char test : array1) {
                map.put(test , 0);
            } // End for

            for(int i = 0 ; i < array2.length ; i ++) {
                if (map.containsKey(array2[i])){
                    return "YES";
                }
            } // End for
        } // End if
        return "NO";
    }
}

public class TwoStrings {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = Result.twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
