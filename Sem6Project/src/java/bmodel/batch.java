package bmodel;

public class batch {

    String b_id, s_id, time, entime;

    public String getB_id() {
        return b_id;
    }

    public void setB_id(String b_id) {
        this.b_id = b_id;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEntime() {
        return entime;
    }

    public void setEntime(String entime) {
        this.entime = entime;
    }

    public batch(String b_id, String s_id, String time, String entime) {
        this.b_id = b_id;
        this.s_id = s_id;
        this.time = time;
        this.entime = entime;
    }

    @Override
    public String toString() {
        return "batch{" + "b_id=" + b_id + ", s_id=" + s_id + ", time=" + time + ", entime=" + entime + '}';
    }

    public batch() {

    }

}
