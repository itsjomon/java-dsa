package oop;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "jomonjoy";
        // myAcc.password  = "abcdefghi"; // can't access
        myAcc.setPassword("abcdefghi");
        System.out.println(myAcc.username);
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}