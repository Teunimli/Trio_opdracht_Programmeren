package Domain;

public class Profile {
    private String accountName;
    private String name;
    private int age;

    public Profile(String accountName, String name, int age) {
        this.name = name;
        this.age = age;
        this.accountName = accountName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccountName(){this.accountName = accountName;}

    public String toString() {
        return name + " " + age ;
    }
}
