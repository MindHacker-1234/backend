package task1;

import java.util.ArrayList;
import java.util.Objects;

public class StudentImpl {
    public void sorted(ArrayList<Student> studentArrayList)
    {
        int i,j;
        int temp1 = 0;
        String temp2;
        for(i=0; i < studentArrayList.size();i++){
            for(j=0; j < studentArrayList.size()-1;j++){
                if(studentArrayList.get(j).getRollno(temp1) > studentArrayList.get(i).getRollno(temp1)){
                    temp1 = studentArrayList.get(j).getRollno(temp1);
                    studentArrayList.get(j).setRollno(studentArrayList.get(j + 1).getRollno(temp1));
                    studentArrayList.get(j + 1).setRollno(temp1);

                    temp2 = studentArrayList.get(j).getStudname();
                    studentArrayList.get(j).setStudname(studentArrayList.get(j+1).getStudname());
                    studentArrayList.get(j + 1).setStudname(temp2);
                }
            }
        }
    }
    public void search(int input, ArrayList<Student> studentslist){
        for(int i=0; i <studentslist.size(); i++) {
            if(Objects.equals(input,studentslist.get(i).getRollno(i))) {
              System.out.println(studentslist.get(i));
            }
        }
    }
    public void display(ArrayList<Student> list){
        for(int k=0; k<list.size();k++) {
            System.out.println(list.get(k));
        }
    }
}
