package 해커랭크;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();

        for (char i : s1.toCharArray()) {
            set.add(i);
        }

        for (char i : s2.toCharArray()) {
            if (set.contains(i)) {
                return "Yes";
            }
        }
        return "No";

    }

}

public class TwoStrings

{

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