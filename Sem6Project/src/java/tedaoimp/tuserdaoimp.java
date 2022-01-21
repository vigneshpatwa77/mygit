/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tedaoimp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tedao.tuserdao;
import temodel.tuser;

/**
 *
 * @author windows
 */
public class tuserdaoimp implements tuserdao {

    tuser t;
    Connection c;
    PreparedStatement s;
    ResultSet r;
    List<tuser> tu;

    public tuserdaoimp() {
        try {
            Class.forName("org.h2.Driver");
            c = DriverManager.getConnection("jdbc:h2:C:\\Users\\windows\\Downloads\\project", "sa", "123");
            System.out.println("connected");
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
        }
    }

    @Override
    public tuser getTeacherbyid(String id) {
        t = new tuser();
        try {
            s = c.prepareStatement("select * from TEACHER where TEACHER_ID = ?");
            s.setString(1, id);
            r = s.executeQuery();
            while (r.next()) {
                t.setId(r.getString(1));
                t.setName(r.getString(2));
                t.setPassword(r.getString(3));
                t.setCourse(r.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("Error While Fetching" + t.getId());
        }
        return t;

    }

    @Override
    public boolean addTeacher(tuser t) {
        try {
            s = c.prepareStatement("insert into TEACHER (TEACHER_ID,NAME,PASSWORD,COURSE) VALUES (?,?,?,?)");
            s.setString(1, t.getId());
            s.setString(2, t.getName());
            s.setString(3, t.getPassword());
            s.setString(4, t.getCourse());
            int i = s.executeUpdate();
            if (i != 0) {
                System.out.println("added" + t.getId() + "sucess");
                return true;
            } else {
                System.out.println("deleted");
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Error while adding");
        }
        return false;
    }

    @Override
    public boolean updateTeacher(tuser t) {
        try {
            s = c.prepareStatement("update TEACHER set NAME=? , PASSWORD=? , COURSE=?  where TEACHER_ID  =?");
            s.setString(1, t.getName());
            s.setString(2, t.getPassword());
            s.setString(3, t.getCourse());
            s.setString(4, t.getId());
            int i = s.executeUpdate();
            if (i != 0) {
                System.out.println("Updated" + t.getId() + "sucess");
                return true;
            } else {
                System.out.println("Failed");
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Error while Updating");
        }
        return false;
    }

    @Override
    public boolean deleteTeacher(tuser t) {
        try {
            s = c.prepareStatement(" delete from TEACHER where TEACHER_ID  =? ");
            s.setString(1, t.getId());
            int i = s.executeUpdate();
            if (i != 0) {
                System.out.println("Deleted" + t.getId() + "sucess");
                return true;
            } else {
                System.out.println("Failed");
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Error while Deleting");
        }
        return false;
    }

    @Override
    public List<tuser> getAlluser() {
        tu = new ArrayList<tuser>();
        try {
            Statement st = c.createStatement();
            r = st.executeQuery("select * from teacher");
            while (r.next()) {                
                t = new tuser();
                t.setId(r.getString(1));
                t.setName(r.getString(2));
                t.setPassword(r.getString(3));
                t.setCourse(r.getString(4));
                tu.add(t);
            }
        } catch (Exception ex) {
            System.out.println(ex);
            
        }
        return tu;
    }



}
