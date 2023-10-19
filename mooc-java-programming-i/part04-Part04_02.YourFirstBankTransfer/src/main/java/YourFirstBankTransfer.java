
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mattAcc = new Account("Matthews account", 1000.00);
        Account myAcc = new Account("My account", 0.00);
        mattAcc.withdrawal(100.00);
        myAcc.deposit(100.00);
        System.out.println(mattAcc);
        System.out.println(myAcc);
    }
}
