package main.java.struction.birdge.bank;

import main.java.struction.birdge.account.Account;

public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return super.account;
    }
}
