import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account){
        this.accounts.remove(account);
    }



    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}

class Account {
    private String name;
    private Integer age;
    private Integer money;

    public Account(String name, Integer age, Integer money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void deposit(int money) {
        this.money+=money;
    }

    public void withdraw(int money) {
        this.money -=money;
    }



    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account first = new Account("Nenad",33,3000);
        bank.addAccount(first);
        bank.addAccount(new Account("Pavle",22,4000));
        System.out.println(bank);
        bank.removeAccount(first);
        System.out.println(bank);
        bank.addAccount(first);
        first.deposit(400);
        System.out.println(bank);
        first.withdraw(200);
        System.out.println(bank);
    }
}
