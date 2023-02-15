package HW_23_02_14_Comparator.Java_Sort.chasnol;

import java.util.*;

public class Java_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());

        List<StudentInfo> student = new ArrayList<>();

        while(testCase > 0) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            StudentInfo studentInfo = new StudentInfo(id, name, cgpa);
            student.add(studentInfo);

            testCase--;
        } // for

        Collections.sort(student, new myComparator());

        for(StudentInfo s : student) {
            System.out.println(s.getNames());
        } // enhanced for

        sc.close();
    } // main
} // end Java_Sort

class StudentInfo {
    int id;
    String name;
    double cgpa;

    public StudentInfo(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    } // constructor

    public int getId() {
        return this.id;
    } // getId

    public String getNames() {
        return this.name;
    } // getName

    public double getCgpa() {
        return this.cgpa;
    } // getCgpa
} // end StudentInfo

class myComparator implements Comparator<StudentInfo> {
    @Override
    public int compare(StudentInfo o1, StudentInfo o2) {
        if(o1.getCgpa() < o2.getCgpa()) {
            return 1;
        } else  if(o1.getCgpa() > o2.getCgpa()){
            return -1;
        } // myComparator getCgpa

        if(!o1.getNames().equals(o2.getNames())) {
            return o1.getNames().compareTo(o2.getNames());
        } // myComparator getNames

        return o1.getId() - o2.getId();
    } // override compare method
} // end myComparator