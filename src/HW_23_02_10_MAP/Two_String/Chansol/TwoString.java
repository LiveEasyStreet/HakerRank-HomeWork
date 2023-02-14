package HW_23_02_10_MAP.Two_String.Chansol;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

	/*
	 * Complete the 'twoStrings' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts following parameters:
	 *  1. STRING s1
	 *  2. STRING s2
	 */

	public static String twoStrings(String s1, String s2) {

		Map<Character, Integer> str = new HashMap<>();
		String result = "";

		for(int i = 0; i < s1.length(); i++) {
			
			str.put(s1.charAt(i), 8);
		} // for
		
		for(int j = 0; j < s2.length(); j++) {
			
			if(str.containsKey(s2.charAt(j))) {
				
				result = "YES";
				break;
			} else {
				
				result = "NO";
			} // if else
			
		} // for
		
		return result;
	} // method

} // end class

public class TwoString {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

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
