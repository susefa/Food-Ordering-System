package administrator;

import java.io.Serializable;

public class User implements Serializable{
    private String name;
    private String userId;
    private String email;
    private String username;
    private String password;
    private String role;

    // Constructor
    public User(String name, String userId, String email, String username, String password, String role) {
        this.name = name;
        this.userId = userId;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters
    public String getName() { return name; }
    public String getUserId() { return userId; }
    public String getEmail() { return email; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setEmail(String email) { this.email = email; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }

    // Convert user details to a string format for file storage
    public String toFileString() {
        return name + "," + userId + "," + email + "," + username + "," + password + "," + role;
    }

    // Convert a stored line back into a User object
    public static User fromFileString(String data) {
        String[] fields = data.split(",");
        if (fields.length == 6) {
            return new User(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
        }
        return null;
    }
}
