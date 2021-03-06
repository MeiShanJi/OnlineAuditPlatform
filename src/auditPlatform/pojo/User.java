package auditPlatform.pojo;

public class User {
    private int id;
    private String username;
    private String password;
    private int admin;
    private String tel;
    private String postbox;

    public User() {

    }

    public User(int id, String username, String password, int admin, String tel, String postbox) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.admin = admin;
        this.tel = tel;
        this.postbox = postbox;
    }

    public User(String username, String password, String tel, String postbox) {
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.postbox = postbox;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPostbox() {
        return postbox;
    }

    public void setPostbox(String postbox) {
        this.postbox = postbox;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", admin=" + admin +
                ", tel='" + tel + '\'' +
                ", postbox='" + postbox + '\'' +
                '}';
    }
}
