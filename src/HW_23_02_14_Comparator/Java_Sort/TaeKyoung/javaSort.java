package HW_23_02_14_Comparator.Java_Sort.TaeKyoung;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class javaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_len=sc.nextInt();
        sc.nextLine();
        String[] strList = new String[input_len];
        for(int i=0;i<input_len;i++){
            String temp  = sc.nextLine();
            strList[i]=temp;
        }
        Arrays.sort(strList,new myOrder());
        for(int i=0;i<input_len;i++){
            System.out.println(strList[i].split(" ")[1]);
        }
    }
}
class myOrder implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String str_o1 = o1.toString();
        double score_o1 = Double.parseDouble(str_o1.split(" ")[2]);
        String str_o2 = o2.toString();
        double score_o2 = Double.parseDouble(str_o2.split(" ")[2]);
        if(score_o2>score_o1){
            return 1;
        }
        else if (score_o2==score_o1){
            String str1 = str_o1.split(" ")[1];
            String str2 = str_o2.split(" ")[1];
            if(str1.compareTo(str2)!=0){
                return str1.compareTo(str2);
                //return str1.toLowerCase().compareTo(str2.toLowerCase());
            }else{
                int i1 = Integer.parseInt(str_o1.split(" ")[0]);
                int i2 = Integer.parseInt(str_o2.split(" ")[0]);
                if(i2>i1){
                    return -1;
                }
                else if(i1 == i2) {
                    return 0;
                }
                else {
                    return 1;
                }
            }
        }
        else {

            return -1;
        }
    }
}
