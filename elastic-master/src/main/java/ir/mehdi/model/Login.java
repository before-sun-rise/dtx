package ir.mehdi.model;

/**
 * @author Mehdi Afsari kashi
 * @version 1.0.0
 * @since 1.0.0
 * <p/>
 * Creation Date : 2015/04/25
 */
public class Login {

    private String username;
    private String password;
    private EvaluationRole role;


    public Login() {
    }

    public Login(String username, String password, EvaluationRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
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

    public EvaluationRole getRole() {
        return role;
    }

    public void setRole(EvaluationRole role) {
        this.role = role;
    }
}
