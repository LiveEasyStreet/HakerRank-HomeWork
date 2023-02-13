package src.Two_String.HaYeong;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class TwoString {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Map<Character, Integer> map = new HashMap<>();

        for(Character c : s1.toCharArray()) {	//입력한 단어를 알파벳 하나씩 쪼개서 저장하기 위해 for문을 돌린다
            map.put(c, 1);
        } //for

        for(Character c : s2.toCharArray()) {
            if(map.containsKey(c)) {			//map네 키값이 있는지 확인
                return "YES";				//존재할 경우 yes를 리턴
            } //if
        } //for

        return "NO";								//아니면 no를 리턴

    } //twoStrings

} //end class

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = TwoString.twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    } //main
} //end class
