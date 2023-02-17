package HW_23_02_14_Comparator.Java_Sort.hayeong;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String fname;
    private double cgpa;


    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    } //Student


    public int getId() {
        return id;
    } //getId

    public String getFname() {
        return fname;
    } //getFname

    public double getCgpa() {
        return cgpa;
    } //getCgpa

} //end class


//Complete the code
public class Java_Sort {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine()); //입력받은 문자열을 int로 변환

        List<Student> studentList = new ArrayList<>();

        while(testCases > 0) { //testCases 가 0보다 클 때
            int id = sc.nextInt();
            String fname = sc.next();
            double cgpa = sc.nextDouble();

            Student st = new Student(id, fname, cgpa);

            studentList.add(st); //스캐너로 입력된 값들을 list에 저장

            testCases--; //반복할 때마다 testCases의 수가 줄어든다.
        } //while


        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student a, Student b) {

                if(a.getCgpa() != b.getCgpa()) { //a와 b의 cgpa 값이 다르면
                    return Double.compare(b.getCgpa(), a.getCgpa()); //b와 a의 cgpa를 비교해서 b가 작으면 음수, 크면 양수를 리턴
                } else {

                    if(!a.getFname().equals(b.getFname())) { //a의 fname이 아닌 값과 b의 fname 값이 같으면
                        return a.getFname().compareTo(b.getFname()); //a와 b의 fname을 비교
                    } else {
                        return a.getId() - b.getId();
                    } //inner if-else

                } //outer if-else

            } //compare

        }); //collections.sort


        for(Student st : studentList) { //studentList 배열을 st에 순차적으로 넣어준다.
            System.out.println(st.getFname()); //st에 저장된 fname을 꺼낸다.
        } //for

    } //main
} //end class