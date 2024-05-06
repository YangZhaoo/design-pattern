package main.java.struction.birdge.bank;

import main.java.struction.birdge.account.Account;

public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract Account openAccount();
}
