package main.java.struction.birdge.account;

public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("开通活期存款账户");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("账户类型: 活期存款");
    }
}
