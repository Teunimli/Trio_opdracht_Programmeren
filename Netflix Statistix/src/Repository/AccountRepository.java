package Repository;

import Domain.Account;

import java.sql.ResultSet;
import java.util.ArrayList;

public class AccountRepository {

    private SqlHandler sqlHandler;

    public AccountRepository(SqlHandler sqlHandler)
    {
        this.sqlHandler = sqlHandler;
    }

    public ArrayList<Account> readAll(){
        ArrayList<Account> list = new ArrayList<Account>();
        try {
            ResultSet rs = sqlHandler.executeSql("SELECT * FROM Account");
            while(rs.next()) {
                list.add(new Account(rs.getInt("Id"),rs.getString("Firstname"), rs.getString("Lastname"),rs.getString("Street"),rs.getInt("HouseNumber"),rs.getString("Annex"), rs.getString("Area"), rs.getBoolean("Active")));
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Account read(int id){
        Account account = null;
        try
        {
            String sqlQuery = "SELECT * FROM Movie WHERE Id=" + id;
            ResultSet rs = sqlHandler.executeSql(sqlQuery);
            rs.next();
            account = new Account(rs.getInt("Id"),rs.getString("Firstname"), rs.getString("Lastname"),rs.getString("Street"),rs.getInt("HouseNumber"),rs.getString("Annex"), rs.getString("Area"), rs.getBoolean("Active"));
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return account;
    }

    public boolean create(Account account){
        try
        {
            String sqlQuery = "INSERT INTO Account VALUES('" + account.getId()+"','" + account.getFirstName() + "','" + account.getLastName()+ "','" + account.getStreet()+"','" + account.getHouseNumber()+"','" + account.getAnnex()+"','" + account.getArea()+"','" + account.isActive()+"'";
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public boolean update(Account account){
        try{
            String sqlQuery = " UPDATE Account SET ('" + account.getId()+"','" + account.getFirstName() + "','" + account.getLastName()+ "','" + account.getStreet()+"','" + account.getHouseNumber()+"','" + account.getAnnex()+"','" + account.getArea()+"','" + account.isActive()+"')WHERE Id = "+account.getId();
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    public boolean delete(Account account) {
        try
        {
            String sqlQuery = "DELETE Account WHERE Id=" + account.getId() ;
            return sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
