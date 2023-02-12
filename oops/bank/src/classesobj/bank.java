package classesobj;

public class bank {
    private String name;
    private int account_no;
    private float balance;

    public void getData() {
        name = "arjun";
        account_no = 984567;
        balance = 10;
    }
    public void deposit(float amount) {
        balance += amount;
    }
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Account number: " + account_no);
        System.out.println("Balance: " + balance);
    }
}
