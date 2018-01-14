package Domain;

public class Account {
    private int id;
    private String accountName;
    private String passWord;
    private String firstName;
    private String insertion;
    private String lastName;
    private String street;
    private int houseNumber;
    private String annex;   //Toevoeging
    private String area;    //Woonplaats
    private int active;

    public Account(String accountName, String passWord, String firstName, String insertion, String lastName, String street, int houseNumber, String annex, String area, int active) {
        this.accountName = accountName;
        this.passWord = passWord;
        this.firstName = firstName;
        this.insertion = insertion;
        this.lastName = lastName;
        this.street = street;
        this.houseNumber = houseNumber;
        this.annex = annex;
        this.area = area;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }
    public String getPassWord() {
        return passWord;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getInsertion(){ return insertion;}

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getAnnex() {
        return annex;
    }

    public String getArea() {
        return area;
    }

    public int isActive() {
        return active;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setAnnex(String annex) {
        this.annex = annex;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String toString() {
        return id + " " + firstName + " " + lastName + " " + street + " " + houseNumber + " " +annex + " " + area + " " + active;
    }
}
