package temodel;

public class tuser {

    private String id, name, password, course;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public tuser(String id, String name, String password, String course) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.course = course;
    }

    public tuser() {
    }

    @Override
    public String toString() {
        return "tuser{" + "id=" + id + ", name=" + name + ", password=" + password + ", course=" + course + '}';
    }

}
