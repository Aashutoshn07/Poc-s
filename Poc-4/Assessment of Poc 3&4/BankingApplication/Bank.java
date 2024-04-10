package BankingApplication;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<BankAccount> accounts ;

    public Bank(){
        accounts = new ArrayList<>();
    }
    public void addBankAccount(BankAccount account){
        accounts.add(account);
    }
    public double getTotalBalance(){
        double totalBalance = 0.0;
        for(BankAccount account: accounts){
            totalBalance += account.getBalance();
        }
        return totalBalance;

    }
}