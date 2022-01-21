/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sedaoimp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sedao.sessionab;
import semodel.session;

/**
 *
 * @author windows
 */
public class sessionimp implements sessionab {

    Connection c;
    PreparedStatement s;
    ResultSet r;
    session se;

    public sessionimp() {
        try {
            Class.forName("org.h2.Driver");
            c = DriverManager.getConnection("jdbc:h2:C:\\Users\\windows\\Downloads\\project", "sa", "123");
            System.out.println("connected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public session getSessionByid(String sid) {
        se = new session();
        try {
            s = c.prepareStatement("select * from Session where SESSION_CODE=?");
            s.setString(1, sid);
            r = s.executeQuery();
            while (r.next()) {
                se.setS_id(r.getString(1));
                se.setB_id(r.getInt(2));
                se.setS_date(r.getString(3));
                se.setEn_date(r.getString(4));
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return se;
    }

    @Override
    public boolean addSession(session se) {
        try {
            s = c.prepareStatement("insert into Session (SESSION_CODE , Batch_Id ,s_time, en_time) VALUES (?,?,?,?)");
            s.setString(1, se.getS_id());
            s.setInt(2, se.getB_id());
            s.setString(3, se.getS_date());
            s.setString(4, se.getEn_date());
            int i = s.executeUpdate();
            if (i != 0) {
                System.out.println("added " + se.getS_id() + " sucess");
                return true;
            } else {
                System.out.println("deleted");
                return false;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }

    @Override
    public boolean UpdateSession(session se) {
        try {
            s = c.prepareStatement("update session set  Batch_Id = ? , s_date=? , en_date =? where SESSION_CODE =? ");

            s.setInt(1, se.getB_id());
            s.setString(2, se.getS_date());
            s.setString(3, se.getEn_date());
            s.setString(4, se.getS_id());
            int i = s.executeUpdate();
            if (i != 0) {
                System.out.println("Update");
                return true;
            } else {
                System.out.println("failed");
                return false;
            }
        } catch (Exception e) {
            System.out.println("fAILED" + e);
        }
        return false;
    }

    @Override
    public boolean DeleteSession(session ses) {

        try {
            s = c.prepareStatement("delete from session where SESSION_CODE = ? ");
            s.setString(1, ses.getS_id());
            int i = s.executeUpdate();
            if (i != 0) {
                System.out.println("Delete " + se.getS_id());
                return true;
            }
        } catch (Exception e) {
            System.out.println("failed" + e);
        }
        return false;
    }

}
