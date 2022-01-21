/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sedao;

import semodel.session;

/**
 *
 * @author windows
 */
public interface sessionab {

    public session getSessionByid(String sid);

    public boolean addSession(session se);

    public boolean UpdateSession(session se);

    public boolean DeleteSession(session ses);
}
