package main.java.struction.birdge.bank;

import main.java.struction.birdge.account.Account;

public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return super.account;
    }
}
