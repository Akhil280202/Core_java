package oops;
import java.util.*;
class Account{
    private String name;
    private String accno;
    private double balance;
    public Account(String name,String accno,double balance){
        this.name=name;
        this.accno=accno;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public String getDetails(){
        return "name: "+name+", accno: "+accno+", balance: "+balance;
    }
}
class Bank{
    private ArrayList<Account> accounts;
    public Bank(){
        accounts=new ArrayList<Account>();
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public void  removeAccount(Account account){
        accounts.remove(account);
    }

    public ArrayList<Account>getAccounts(){
        return accounts;
    }
}
public class Bank_details {
    public static void main(String[]args){
        Bank bank=new Bank();
        Account account1=new Account("Akhil","46234ywrgf",100000);
        Account account2=new Account("Johi","uege378265897483",100876);
        Account account3=new Account("Karan","hfv43645722",4732446);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        ArrayList<Account>accounts=bank.getAccounts();
        for(Account account:accounts){
            System.out.println(account.getDetails());
        }
    }
}
