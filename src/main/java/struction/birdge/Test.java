package main.java.struction.birdge;

import java.util.Properties;

/**
 * JDK中的桥接模式
 * {@link java.sql.DriverManager}
 * {@link java.sql.Driver#connect(String, Properties)}
 * 抽象部分时DriverManager，实现部分的接口是Driver，具体实现交由各个数据库厂商。
 * DriverManager将getConnection的实现委托给具体的实现。
 */
public class Test {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icAccount = icbcBank.openAccount();
//        icAccount.openAccount();
        icAccount.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
//        abcAccount.openAccount();
        abcAccount.showAccountType();

        Bank bank = new ABCBank(new DepositAccount());
        Account abcAccount2 = bank.openAccount();
//        abcAccount2.openAccount();
        abcAccount2.showAccountType();


    }
}
