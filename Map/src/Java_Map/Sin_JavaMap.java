package src.Java_Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Sin_JavaMap {

	public static Map<String, Integer> map;
	public static final BufferedReader br;

	static {
		map = new HashMap<>();
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {

		try (br) {
			int number;
			int test_case;
			String name;
			String find_key;

			test_case = Integer.parseInt(br.readLine());

			for (int i = 0; i < test_case; i++) {
				name = br.readLine();
				number = Integer.parseInt(br.readLine());
				map.put(name, number);
			} // End For

			while (!(find_key = br.readLine().trim()).isEmpty()) {
				// 원래는 for문을 사용 후에 조건을 map.size()로 걸어두었는데 문제가 발생하였다.
				// 문제 발생의 원인은 map의 특징에 있었다.
				// map의 value값의 경우 중복을 허용하지만 key값의 경우 중복을 허용하지 않는다.
				// 때문에 테스트 케이스 수만큼 값을 넣을 때 만약 중복된 key값 3개가 들어온다면 map.size()는 1을 반환한다.
				// 이런 경우 테스트 수 == map.size 라는 나의 알고리즘의 트러블이 생긴다.

				// 그리고 위의 while문의 내용은 다음과 같다.
				// 1 ) br.reaLine() 입력 trim() 앞 뒤 공백제거 => find_key에 값 저장
				// 2 ) find_key.isEmpty ( isEmpty <=> isBlank )의 의미는 입력받은 문자열의 길이가 0이면 true
				// 3 ) 즉 , 비어있다면 의 뜻인대 앞에 부정연산자가 붙음
				// 4 ) find_key의 값이 비어있지 않다면 계속 출력해라
				// 5 ) 테스트를 입력 받으면 계속하라는 의미를 표현
				if (map.containsKey(find_key))
					System.out.println(find_key + "=" + map.get(find_key));
				else
					System.out.println("Not found");
			} // end while
		} catch (Exception e) {
		} // End try catch
	} // end main
} // end class