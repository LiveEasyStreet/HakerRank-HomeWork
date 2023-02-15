package HW_23_02_14_Comparator.Java_Sort.Yumi;

import java.util.*;
public class Java_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0) {
            int id = sc.nextInt();
            String fname = sc.next();
            double cgpa = sc.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        } // while
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getCgpa() > s2.getCgpa()) {
                    return -1;
                } else if(s1.getCgpa() < s2.getCgpa()) {
                    return 1;
                }
                if(s1.getFname().compareTo(s2.getFname()) == 0) {
                    if(s1.getId() > s2.getId()) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                else {
                    return s1.getFname().compareTo(s2.getFname());
                }
            }
        });

        for(Student st : studentList) {
            System.out.println(st.getFname());
        }
    } // main

} // end class
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
