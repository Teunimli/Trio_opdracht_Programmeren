package Repository;

import Database.dbConnection;
import Domain.Account;

import java.sql.ResultSet;
import java.util.ArrayList;

public class AccountRepository {

    public AccountRepository()
    {

    }

    public ArrayList<Account> readAll(){
        ArrayList<Account> list = new ArrayList<Account>();
        try {
            String sql = "SELECT * FROM Account";
            ResultSet rs = dbConnection.sqlHandler.executeSql(sql);
            while(rs.next()) {
                list.add(new Account(rs.getString("Accountname"), rs.getString("Password") ,rs.getString("Firstname"), rs.getString("Insertion"), rs.getString("Lastname"),rs.getString("Street"),rs.getInt("HouseNumber"),rs.getString("Annax"), rs.getString("Area"), rs.getInt("Active")));
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
            ResultSet rs = dbConnection.sqlHandler.executeSql(sqlQuery);
            rs.next();
            account = new Account(rs.getString("Accountname"), rs.getString("Password"),rs.getString("Firstname"),rs.getString("Insertion"),  rs.getString("Lastname"),rs.getString("Street"),rs.getInt("HouseNumber"),rs.getString("Annax"), rs.getString("Area"), rs.getInt("Active"));
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return account;
    }

    public boolean create(Account account){
        try
        {
            String sqlQuery = "INSERT INTO Account (Accountname, Password, Firstname, Insertion, Lastname, Street, Housenumber, Annax, Area, Active) VALUES('" + account.getAccountName()  + "', '" + account.getPassWord()  + "' ,'" + account.getFirstName() + "', '" + account.getInsertion() + "' ,'" + account.getLastName()+ "','" + account.getStreet()+"','" + account.getHouseNumber()+"','" + account.getAnnex()+"','" + account.getArea()+"'," + account.isActive()+")";
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public boolean update(Account account){
        try{
            String sqlQuery = " UPDATE Account SET ('" + account.getFirstName() + "','" + account.getLastName()+ "','" + account.getStreet()+"','" + account.getHouseNumber()+"','" + account.getAnnex()+"','" + account.getArea()+"','" + account.isActive()+"')WHERE Id = "+1;
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    public boolean delete(Account account) {
        try
        {
            String sqlQuery = "DELETE Account WHERE Id=" + 1 ;
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
