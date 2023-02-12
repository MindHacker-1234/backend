package encapsulation;

public class account {
    private int accountscount;
    private int usersnumber;



    public int getAccountscount() {
        return accountscount;
    }

    public int getUsersnumber() {
        return usersnumber;
    }

    public void setAccountscount(int accountscount) {
        this.accountscount = accountscount;
    }

    public void setUsersnumber(int usersnumber) {
        this.usersnumber = usersnumber;
    }
}
class main {
    public static void main(String args[]) {
        account A = new account();
        A.setAccountscount(112);
        A.setUsersnumber(84);
        System.out.println(A.getAccountscount());
        System.out.println(A.getUsersnumber());

    }
}
