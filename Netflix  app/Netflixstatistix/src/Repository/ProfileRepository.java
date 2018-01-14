package Repository;

import Database.dbConnection;
import Domain.Account;
import Domain.Profile;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ProfileRepository {
        private AccountRepository accountRepository= new AccountRepository();

    public boolean create(Profile profile){
            int accountId = accountRepository.readIdWithAccountName(profile.getAccountName());
            int countAccounts = accountRepository.countAccountsWithAccountId(accountId);

                if(countAccounts < 5){
                    try
                    {
                        String sqlQuery = "INSERT INTO Profile (AccountId, Profilename, Age) VALUES('" + accountId  + "', '" + profile.getName()  + "' ,'" + profile.getAge() +"' )";
                        return dbConnection.sqlHandler.executeSqlNoResult(sqlQuery);
                    }
                    catch(Exception e) {
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
}

