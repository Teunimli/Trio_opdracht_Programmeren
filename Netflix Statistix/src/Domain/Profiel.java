package Domain;

public class Profiel {
    private String name;
    private int age;
    private Account account;

    public Profiel(String name, int age, Account account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Account getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String toString() {
        return name + " " + age +" " + account;
    }
}
