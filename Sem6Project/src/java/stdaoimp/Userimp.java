/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stdaoimp;

import stdao.Userdao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import stmodel.User;

/**
 *
 * @author HP
 */
public class Userimp implements Userdao{
    User u;
    List<User> ul;
     Connection c;
     PreparedStatement s;
     ResultSet r;

    public Userimp() {
        try {
            Class.forName("org.h2.Driver");
            c = DriverManager.getConnection("jdbc:h2:C:\\Users\\windows\\Downloads\\project", "sa", "123");
            System.out.println("connected");
        } catch (Exception e) {
            System.out.println(e);
        } 
        
    }
	
    
    @Override
    public List<User> getAllluser() {
        ul = new ArrayList<User>();
        try {
            Statement st = c.createStatement();
            r = st.executeQuery("select * from student");
            while (r.next()) {                
                u = new User();
                u.setId(r.getString(1));
                u.setName(r.getString(2));
                u.setSessionid(r.getString(3));
                ul.add(u);  
            }
        } catch (SQLException ex) {
            System.out.println("error ");
            Logger.getLogger(Userimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ul;
    }

    @Override
    public User getUserbyname(String name) {
        u = new User();
      try {
          s = c.prepareStatement("select * from teacher where name=?");
          s.setString(1, name);
          r = s.executeQuery();
            while (r.next()) {                
                u.setName(r.getString(2));

        }        
            
    }   catch (SQLException ex) {
            Logger.getLogger(Userimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
  
    }
        

    @Override
    public boolean updateUser(User u) {
        try {
            s = c.prepareStatement("update student set name=? , session_id = ? where STUDENT_ID  =? ");
            
            s.setString(1, u.getName());
            s.setString(2, u.getSessionid());
            s.setString(3, u.getId());
            int i = s.executeUpdate();
            if (i != 0) {
                System.out.println("Update");
                return true;
            } else {
                System.out.println("failed");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean deleteUser(User u) {
        try {
            s = c.prepareStatement("delete from STUDENT where STUDENT_ID =? ");
            s.setString(1, u.getId());
            int i = s.executeUpdate();
            if (i !=0) {
                System.out.println("Delete");
                return true;
            } 
        } catch (Exception e) {
            System.out.println("failed");
        }
        
        return false;
    }

    @Override
    public User getUserbyId(String id) {
         u = new User();
      try {
          s = c.prepareStatement("select * from STUDENT where STUDENT_ID=?");
          s.setString(1, id);
          r = s.executeQuery();
            while (r.next()) {
                u.setId(r.getString(1));
                u.setName(r.getString(2));
                u.setSessionid(r.getString(3));
        }        
            
    }   catch (SQLException ex) {
            Logger.getLogger(Userimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    @Override
    public boolean addUser(User u) {
        try {
            s = c.prepareStatement("insert into STUDENT (STUDENT_ID, NAME ,SESSION_ID) VALUES (?,?,?)");
            s.setString(1, u.getId());
            s.setString(2, u.getName());
            s.setString(3, u.getSessionid());
          int i =  s.executeUpdate();
            if (i!=0) {
                System.out.println("added"+u.getId()+"sucess");
                return true;
            } else {
                System.out.println("deleted");
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Userimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
}
