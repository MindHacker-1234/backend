package inheritance;

public class account {
    String accountholdername;
    int accountnumber;

}
class bank extends account {
    int a;
    int b;
    public void set(int a, int b, String accountholdername, int accountnumber){
        this.a = a;
        this.b = b;
        super.accountholdername = accountholdername;
        super.accountnumber = accountnumber;
    }
    public void get() {
        System.out.println("a:" + a + "\nb:" + b + "\naccountholdername" + accountholdername + "\naccountnumber" + accountnumber);

    }
}

   class city extends account {
    int A;
    int B;
    public void set(int A, int B, String accountholdername, int accountnumber) {
        this.A = A;
        this.B = B;
        super.accountholdername = accountholdername;
        super.accountnumber = accountnumber;
    }

    public void get() {
        System.out.println("A:" + A + "\nB:" + B + "\n accountholdername" + accountholdername + "\n accountnumber" + accountnumber);

    }
   }
   class inheritance1 {
        public static void main(String args[]) {
            account obj = new account();
            bank obj2 = new bank();
            obj2.set(30,40,"mark",93978);
            obj2.get();
            city obj3 = new city();
            obj3.set(10,50,"da vinici",89645);
            obj3.get();

        }
   }