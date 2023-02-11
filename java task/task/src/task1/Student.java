package task1;

public class Student {
    private  String Studname;
    private  int Rollno;


    public String getStudname() {
        return Studname;
    }

    public void setStudname(String studname) {
        Studname = studname;
    }

    public int getRollno(int temp1) {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("Studname='").append(Studname).append('\'');
        sb.append(", Rollno=").append(Rollno);
        sb.append('}');
        return sb.toString();
    }


}

