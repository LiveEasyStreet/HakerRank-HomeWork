package src.Java_Map.HaYeong;

//Complete this code or write your own from scratch

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Java_Map {


    public static void main(String []args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();     //인원 수 입력
        sc.nextLine();

        String name = null;        //사람 이름을 입력하기 위한 변수
        int phone = 0;           //전화번호를 입력하기 위한 변수


        for(int i = 0; i < n; i++) {            //인원 수에 맞게 이름과 전화번호를 입력받을 때까지 루프
            name = sc.nextLine();
            phone = sc.nextInt();
            sc.nextLine();

            map.put(name, phone);               //map에 스캐너로 입력받은 값들을 저장

        } //for

        while(sc.hasNext()) {           //null이 나올 경우 false가 나오게 하는 기능
            String s = sc.nextLine();

            if( map.get(s) != null ) {	//null이 아니면 입력한 값이 맞게 출력
                System.out.println( s + "=" + map.get(s));
            } else {
                System.out.println("Not found");		//null이면 not found 출력
            } //if-else



        } //while

    } //main

} //end class
