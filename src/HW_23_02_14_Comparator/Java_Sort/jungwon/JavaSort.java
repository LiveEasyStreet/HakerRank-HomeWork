package HW_23_02_14_Comparator.Java_Sort.jungwon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        if (this.cgpa < o.cgpa) {
            return 1;
        } else if (this.cgpa > o.cgpa) {
            return -1;
        } else {
            if (this.fname.compareTo(o.fname) < 0) {
                return -1;
            } else if (this.fname.compareTo(o.fname) > 0) {
                return 1;
            } else {
                if (this.id < o.id) {
                    return -1;
                } else if (this.id > o.id) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
    }

} // end student

//Complete the code
public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}