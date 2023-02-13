package src.Java_Map.JungWon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, String> member = new HashMap<>();

		int tempNum = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < tempNum; i++) {
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			member.put(str1, str2);
		}

		while(sc.hasNext()) {
			String str3 = sc.nextLine();
			if (member.get(str3) != null) {
				System.out.println(str3 + "=" + member.get(str3));
			} else {
				System.out.println("Not found");
			}

		}

		sc.close();

	}
}