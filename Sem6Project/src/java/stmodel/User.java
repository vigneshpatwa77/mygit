/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stmodel;

/**
 *
 * @author HP
 */
public class User {

    private String id, name, sessionid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public User(String id, String name, String sessionid) {
        this.id = id;
        this.name = name;
        this.sessionid = sessionid;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", sessionid=" + sessionid + '}';
    }

    public User() {
    }

}
