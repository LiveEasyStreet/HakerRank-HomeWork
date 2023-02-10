package src.Java_Map.Chansol;

import java.util.*;


public class JavaMap {


	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		int round = sc.nextInt();

		for(int i = 0; i < round; i++) {

			sc.nextLine();
			
			String name = sc.nextLine();
			int phoneNumber = sc.nextInt();

			map.put(name, phoneNumber);
		} // for(input)

		sc.nextLine();

		while(sc.hasNext()) {

			String getValues = sc.nextLine();

			if(map.containsKey(getValues)) {

				System.out.println(getValues + "=" + map.get(getValues));
			} else {

				System.out.println("Not found");
			} // if else

		} // while

		sc.close();
	} // main

} // end class