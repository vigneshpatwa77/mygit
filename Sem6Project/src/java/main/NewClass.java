/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import bdaoimp.batchimp;
import bmodel.batch;
import java.util.List;
import sedaoimp.sessionimp;
import semodel.session;
import stdaoimp.Userimp;
import stmodel.User;

/**
 *
 * @author HP
 */
public class NewClass {
    public static void main(String[] args) {
//        String id ="HT1"; 
//        Userimp ui = new Userimp();
//        User u = ui.getUserbyId(id);
//        System.out.println(u);   
//    boolean b = ui.addUser(u);
//    if(b){
//        System.out.println("sucess");
//       
//    }
//    else{
//        System.out.println("failed");
//    }
//        
        Userimp ui = new Userimp();
        List<User> uu = ui.getAllluser();        
        for (User u: uu) {
           System.out.println(u);       
        }
//        User u = ui.getUserbyId("S2");
//          
//        u.setName("Siddhesh");
//        u.setSessionid("HT1");
//        
//        boolean b = ui.updateUser(u);
//        if (b) {
//            System.out.println("suc");
//        } else {
//            System.out.println("rej");
//        }
//        boolean b = ui.deleteUser(u);
//        if (b) {
//            System.out.println("suceess");
//        } else {
//            System.out.println("fail");
//        }
//        String id="JAV2";
//        tuserdaoimp ti = new tuserdaoimp();
//        tuser t = ti.getTeacherbyid(id);
//        System.out.println(t);
//        String id = "HT2";
//        Atimp ai = new Atimp();
//        Atuser a = new Atuser ("HT1", "HT", "0", "12/18/2021");
////        System.out.println(a);
//        boolean b = ai.addAttendence(a);
//        if (b) {
//            System.out.println("Added");
//        } else {
//            System.out.println("failed");
//        for (int i = 0; i < at.size(); i++) {
//            System.out.println(at.get(i));
//        }
//        }
//String id = "HT2";
//Atimp ai = new Atimp();
//List<Atuser> at = ai.getAlAtbyId(id);
//int i =0;
// Iterator<Atuser> it = at.iterator();
//        while (it.hasNext()) {            
//            System.out.println(it.next());
//        }    
//        batchimp bi = new batchimp();
//        batch b = new batch(4, "JAV2", "17:00 - 18:00");
//        boolean s = bi.addBatch(b);
//        if (s) {
//            System.out.println("Added");
//        } else {
//            System.out.println("failed");
//        }
//        String id = "3";
//        batch b = new batch();
//        batchimp bi = new batchimp();
//        b = bi.getBatchById(id);
//        boolean a = bi.DeleteBatch(b);
//        if (a) {
//            System.out.println("Delete");
//        } else {
//        }
//    String sid = "JAVA";
//     sessionimp si = new sessionimp();
//    session se = si.getSessionByid(sid);
//    System.out.println();
//    se.setT_id("JAV2");
//    se.setB_id(4);
//    boolean bi = si.UpdateSession(se);
//    if(bi){
//        System.out.println("Pass");
//    }else{
//        System.out.println("failed");
//    }
//    String b_id1 = "5" , s_id ="JAV2", time = "12/12/2021";
//     
//    batchimp bi = new batchimp();
//        batch b = new batch(b_id1, s_id, time);
//        boolean s = bi.addBatch(b);
//        if (s) {
//            System.out.println("pass");
//        } else {
//            System.out.println("failed");
//       }
    
    
    
//    System.out.println(si);
//    boolean b = si.DeleteSession(se);
//    if(b){
//        System.out.println("pass");
//    }else{
//        System.out.println("failed");
//    }
}
    }
