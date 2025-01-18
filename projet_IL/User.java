package fr.coffeemocha.modele;

public class User {
    private String username;
    private String password;
    private boolean authenticated;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.authenticated = false;
    }

    public boolean authenticate(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            this.authenticated = true;
            return true;
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }
}
