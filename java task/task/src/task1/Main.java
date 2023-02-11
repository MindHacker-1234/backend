package task1;
import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
           ArrayList<Student> studentslist = new ArrayList<>();

           Student s1 = new Student();
           s1.setStudname("Mark");
           s1.setRollno(1);
           studentslist.add(s1);
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        Student s2 = new Student();
        s2.setStudname("elizabeth");
        s2.setRollno(3);
        studentslist.add(s2);

        Student s3 = new Student();
        s3.setStudname("isabell");
        s3.setRollno(2);
        studentslist.add(s3);

        Student s4 = new Student();
        s4.setStudname("hari");
        s4.setRollno(5);
        studentslist.add(s4);

        StudentImpl simp = new StudentImpl();
        System.out.println("the nonsorted list:");
        simp.display(studentslist);
        simp.sorted(studentslist);
        System.out.println();
        simp.search(input, studentslist);
        System.out.println();
        System.out.println("sorted list");
        System.out.println(studentslist);







    }
}