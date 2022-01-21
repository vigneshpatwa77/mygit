/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdaoimp;

import bdao.batchab;
import bmodel.batch;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author windows
 */
public class batchimp implements batchab {

    Connection c;
    PreparedStatement s;
    ResultSet r;
    batch b;
    List<batch> bl;
    public batchimp() {
        try {
            Class.forName("org.h2.Driver");
            c = DriverManager.getConnection("jdbc:h2:C:\\Users\\windows\\Downloads\\project", "sa", "123");
            System.out.println("connected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public batch getBatchById(String b_id) {
        b = new batch();
        try {
            s = c.prepareStatement("select * from batch where Batch_ID = ?");
            s.setString(1, b_id);
            r = s.executeQuery();
            while (r.next()) {
                b.setB_id(r.getString(1));
                b.setS_id(r.getString(2));
                b.setTime(r.getString(3));
                b.setEntime(r.getString(4));
            }
        } catch (Exception e) {
        }
        return b;
    }

    @Override
    public boolean addBatch(batch b) {
        try {
            s = c.prepareStatement("insert into batch (batch_ID, teacher_id ,date,edate) VALUES (?,?,?,?)");
            s.setString(1, b.getB_id());
            s.setString(2, b.getS_id());
            s.setString(3, b.getTime());
            s.setString(4, b.getEntime());
            int i = s.executeUpdate();
            if (i != 0) {
                System.out.println("added" + b.getB_id() + "sucess");
                return true;
            } else {
                System.out.println("failed");
                return false;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }

    @Override
    public boolean UpdateBatch(batch b) {
        try {
            s = c.prepareStatement("update batch set teacher_id=? , date = ? , edate =? where batch_ID =? ");
            s.setString(1, b.getS_id());
            s.setString(2, b.getTime());
            s.setString(3, b.getEntime());
            s.setString(4, b.getB_id());
            int i = s.executeUpdate();
            if (i != 0) {
                System.out.println("Update " + b.getB_id());
                return true;
            }
        } catch (Exception e) {
            System.out.println("failed");
        }

        return false;
    }

    @Override
    public boolean DeleteBatch(batch b) {
        try {
            s = c.prepareStatement("delete from batch where batch_ID =? ");
            s.setString(1, b.getB_id());
            int i = s.executeUpdate();
            if (i != 0) {
                System.out.println("Delete" + b.getB_id());
                return true;
            }
        } catch (Exception e) {
            System.out.println("failed");
        }

        return false;
    }

    @Override
    public List<batch> getAllBatch() {
        bl = new ArrayList<batch>();
        try {
            Statement st = c.createStatement();
             r = st.executeQuery("select * from batch");
            while (r.next()) {                
                b = new batch();
                b.setB_id(r.getString(1));
                b.setS_id(r.getString(2));
                b.setTime(r.getString(3));
                b.setEntime(r.getString(4));
                bl.add(b);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return bl;
        
    }

}
