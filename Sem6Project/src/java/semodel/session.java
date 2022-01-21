/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semodel;

/**
 *
 * @author windows
 */
public class session {

    String s_id, s_date, en_date;
    int b_id;

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getS_date() {
        return s_date;
    }

    public void setS_date(String s_date) {
        this.s_date = s_date;
    }

    public String getEn_date() {
        return en_date;
    }

    public void setEn_date(String en_date) {
        this.en_date = en_date;
    }

    public session(String s_id, int b_id, String s_date, String en_date) {
        this.s_id = s_id;
        this.b_id = b_id;
        this.s_date = s_date;
        this.en_date = en_date;

    }

    @Override
    public String toString() {
        return "session{" + "s_id=" + s_id + ", s_date=" + s_date + ", en_date=" + en_date + ", b_id=" + b_id + '}';
    }



    public session() {
    }

}
