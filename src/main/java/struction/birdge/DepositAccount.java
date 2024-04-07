package main.java.struction.birdge;

public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("开通定期存款账户");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("账户类型: 定期存款");
    }
}
