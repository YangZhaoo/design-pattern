package main.java.behavioral.visitor.example2;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Resume bachler = new Bachelor();
        Resume master = new Master();

        Company abc = new ABCCompany("ABC", "http://www.abc.com/interval");
        Company zzz = new ZZZCompany("zzz", "http://www.zzz.com/interval");

        List<Company> list = Arrays.asList(abc, zzz);

        list.stream().forEach(company -> company.accept(bachler));
        list.stream().forEach(company -> company.accept(master));

    }
}
