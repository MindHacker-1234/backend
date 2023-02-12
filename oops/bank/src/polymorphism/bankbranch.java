package polymorphism;

public class bankbranch {
    public void accountdetails() {
        System.out.println("the account number is 557618");
    }
}
class bank extends bankbranch {
    public void accountdetails() {
        System.out.println("the account holder name is nolan");
    }
}
class city extends bankbranch {
    public void accountdetails() {
        System.out.println("the account holder resides in mumbai");
    }
}
class details {
    public static void main(String args[]) {
        bankbranch obj = new bankbranch();
        bank obj2 = new bank();
        city obj3 = new city();
        obj.accountdetails();
        obj2.accountdetails();
        obj3.accountdetails();

    }
}
