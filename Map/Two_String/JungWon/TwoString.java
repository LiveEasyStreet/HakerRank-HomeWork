package Two_String.JungWon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tempNum = sc.nextInt();
		sc.nextLine();

t:		for (int i = 0; i < tempNum; i++) {
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			Map<Character,Integer> strMap1 = new HashMap<>();

			for (int j = 0; j < str1.length(); j++) {
				strMap1.put(str1.charAt(j),j);
			}
			for (int j = 0; j < str2.length(); j++) {
				if(strMap1.containsKey(str2.charAt(j))) {
					System.out.println("YES");
					continue t;
				}
			}
			System.out.println("NO");

		}

		sc.close();

	}
}