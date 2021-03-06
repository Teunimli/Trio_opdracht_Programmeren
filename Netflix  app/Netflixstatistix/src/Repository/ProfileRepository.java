package Repository;

import Database.dbConnection;
import Domain.Account;
import Domain.Profile;

import java.sql.ResultSet;
import java.util.ArrayList;

import static javax.swing.JOptionPane.showMessageDialog;

public class ProfileRepository {
        private AccountRepository accountRepository= new AccountRepository();

    public boolean create(Profile profile){
            int accountId = accountRepository.readIdWithAccountName(profile.getAccountName());
            int countAccounts = accountRepository.countAccountsWithAccountId(accountId);

                if(countAccounts < 5){
                    try
                    {
                        String sqlQuery = "INSERT INTO Profile (AccountId, Profilename, Age) VALUES('" + accountId  + "', '" + profile.getName()  + "' ,'" + profile.getAge() +"' )";
                        showMessageDialog(null, "Toevoegen van een profiel is gelukt");
                        return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
                    }
                    catch(Exception e) {
                        showMessageDialog(null, "Toevoegen van ene progiel niet gelukt");
                        System.out.println(e);
                    }
                }
            return false;
        }

    public ArrayList read(int id){
        ArrayList<String> profileNames = new ArrayList<String>();
        try
        {
            String sqlQuery = "SELECT Profilename FROM Profile WHERE AccountId = " + id;
            ResultSet rs = dbConnection.sqlHandler.executeSql(sqlQuery);
            while(rs.next()) {
                profileNames.add(rs.getString("Profilename"));
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return profileNames;
    }

    public int readIdWithProfileName (String name){
        int profileId = 0;
        try
        {
            String sqlQuery = "SELECT ProfileId FROM Profile WHERE Profilename = '" + name + "'";
            ResultSet rs = dbConnection.sqlHandler.executeSql(sqlQuery);
            while(rs.next()) {
                profileId = rs.getInt("ProfileId");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return profileId;
    }

    public boolean update(Profile profile){
        int profileId = readIdWithProfileName(profile.getAccountName());

        try{
            String sqlQuery = " UPDATE Profile SET Profilename = '" + profile.getAccountName() + "', Age = " + profile.getAge() +" WHERE ProfileId = "+ profileId ;
            showMessageDialog(null, "Updaten van progiel gelukt");
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch (Exception e){
            showMessageDialog(null, "Updaten van profiel niet gelukt");
            System.out.println(e);
        }
        return false;
    }

    public int readIdWithProfiletName (String name){
        int profileId = 0;
        try
        {
            String sqlQuery = "SELECT ProfileId FROM Profile WHERE Profilename = '" + name + "'";
            ResultSet rs = dbConnection.sqlHandler.executeSql(sqlQuery);
            while(rs.next()) {
                profileId = rs.getInt("profileId");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return profileId;
    }

    public int readProfile(int id){
        int profile = 0;
        try
        {
            String sqlQuery = "SELECT ProfileId FROM Profile WHERE ProfileId=" + id;
            ResultSet rs = dbConnection.sqlHandler.executeSql(sqlQuery);
            while(rs.next()) {
                profile = rs.getInt("ProfileId");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return profile;
    }

    public boolean delete(int profileId) {
        try
        {
            String sqlQuery = "DELETE FROM Profile WHERE ProfileId = " + profileId +"";
            showMessageDialog(null, "Deleten van een profiel gelukt");
            return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
        }
        catch(Exception e) {
            showMessageDialog(null, "Deleten van progiel niet gelukt");
            System.out.println(e);
        }
        return false;
    }
}

