package HW_23_02_14_Comparator.Java_Sort.wongyoon;

import java.util.*;

public class WonGyoon_homework {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Member> members = new ArrayList<>();

        int test = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < test; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();


            Member member = new Member(id, name, cgpa);
            members.add(member);
        } //End for

        Collections.sort(members, new Comparator<Member>() {

            // 검색
            // 1 ) 정렬 대상 , 정렬기준
            // 2 ) 정렬대상 ( 이 경우는 배열안에 이미 정렬 기준이 있다,)

            //  위의 코드는 정렬 기준을 익명자식객체를 이용하였다.
            //  Compare => Comparator , CompareTo => Comparable

            @Override
            public int compare(Member o1, Member o2) {
                if (o1.getCgpa() != o2.getCgpa()) {
                    return Double.compare(o2.getCgpa(), o1.getCgpa());
                    // o1.getCgpa < o2.Cgpa return -1
                    // o1.getCgpa > o2.Cgpa return 1
                    // o1.getCgpa == o2.Cgpa return 0
                    // 문제의 요구사항 : cgpa로 먼저 비교

                } else {
                    // cgpa가 같은 경우
                    if (!(o1.getName().equals(o2.getName()))) {
                        // cgpa는 같고 이름이 다른경우
                        return o1.getName().compareTo(o2.getName());
                        // 내림 차순
                    } else {
                        // CGPA , 이름이 같은 경우
                        return o1.getID() - o2.getID();
                    } //ELSE
                } // IF ELSE
            } // COMPARE 메소드
        }); // 익명자식객체
        for (Member a : members) {
            System.out.println(a.getName());
        }
    } //End main
} // End class

class Member {
    private int id;
    private String name;
    private double cgpa;

    public Member(int id, String name, double cgpa) {

        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    } // end Constructor

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCgpa() {
        return this.cgpa;
    }
} // End class