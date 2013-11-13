package springmvc.form.disallow.submit.duplicate.model;

public class User implements java.io.Serializable {
    private static final long serialVersionUID = 8337959758508200055L;
    private Long id;
    private String username;
    private String password;
    
    public User() {        
    }
    
    public Long getId() {
        return this.id;
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

    @Override
    public String toString() {
        return "[id=" + id + ", username=" + username + ", password=" + password + "]";
    }
}
