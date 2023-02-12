package abstraction;

abstract class bankbranch {
    public abstract void accountdetails();
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
          bank obj1 = new bank();
          city obj2 = new city();
          obj1.accountdetails();
          obj2.accountdetails();
    }
}