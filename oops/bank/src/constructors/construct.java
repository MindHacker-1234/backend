package constructors;

public class construct {
    private String name;
    private int account;
    private float balance;

    public construct() {
        name = null;
        account = 11111;
        balance = 1;
    }
    public construct(String n, int acc, float ba, float amt) {
        name = n;
        account = acc;
        balance = ba;
    }
    public construct(String name, int acc, float balance) {
        this.name = name;
        this.account = acc;
        this.balance = balance;

    }
    public construct(construct A) {
        name = A.name;
        account = A.account;
        balance = A.balance;
    }
     public void deposit(float amt){
        balance = balance + amt;
     }
     public void displayData() {
         System.out.println("Name:" + name);
         System.out.println("account number:" + account);
         System.out.println("balance:" + balance);

     }
     public static void main(String args[]) {
        construct obj1 = new construct();
         construct obj2 = new construct("kevin", 8790,100000,1000);
         construct obj3 = new construct("Mark", 3584,30000);
         construct obj4 = new construct(obj2);
         obj1.deposit(10000);
         obj1.displayData();
         obj2.displayData();
         obj3.displayData();
         obj4.displayData();

     }
}
