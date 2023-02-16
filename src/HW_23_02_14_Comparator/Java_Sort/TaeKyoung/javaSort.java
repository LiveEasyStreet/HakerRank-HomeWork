package HW_23_02_14_Comparator.Java_Sort.TaeKyoung;

import java.util.*;

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

//Complete the code
public class javaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        class myOrder implements Comparator<Student>{

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getCgpa()==o2.getCgpa()){ //같으면
                    if(o1.getFname().compareTo(o2.getFname())==0) {
                        return o2.getId() - o1.getId();
                    } else {
                        return o1.getFname().compareTo(o2.getFname());
                    }
                }else {
                    int temp = (int)((o2.getCgpa()-o1.getCgpa())*1000);
                    return temp;
                }
            }
        }
        Collections.sort(studentList,new myOrder());

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



