/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stdao;

import java.util.List;
import stmodel.User;

/**
 *
 * @author HP
 */
public interface Userdao {
    public List<User> getAllluser();
    public User getUserbyname(String name);
    public User getUserbyId(String id);
    public boolean addUser(User u);
    public boolean updateUser(User u);
    public boolean deleteUser(User u);
}
