package gui;

import Database.dbConnection;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OverzichtActionListener implements ActionListener {
    private JComboBox combo1;
    private JComboBox combo2;
    private JTable table;
    private dbConnection db = new dbConnection();
    public OverzichtActionListener(JComboBox combo1,JComboBox comb2,JTable table)
    {
        this.combo1=combo1;
        this.combo2=comb2;
        this.table=table;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        table.setModel(DbUtils.resultSetToTableModel(db.sqlHandler.executeSql("SELECT Episode.Title, AVG(Percentage) as '%Bekeken'\n" +
                "FROM Episode\n" +
                "INNER JOIN Serie ON Episode.SerieId = Serie.SerieId\n" +
                "INNER JOIN Program ON Episode.EpisodeId = Program.EpisodeId\n" +
                "INNER JOIN Profile ON Program.ProfileId = Profile.ProfileId\n" +
                "INNER JOIN Account ON Profile.AccountId = Account.AccountId\n" +
                "WHERE Serie.Title = '"+combo2.getSelectedItem().toString()+"' AND Accountname = '"+combo1.getSelectedItem().toString()+"'\n" +
                "GROUP BY Episode.Title")));
    }
}
