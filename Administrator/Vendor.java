package administrator;

public class Vendor extends User {
    public Vendor(String name, String userId, String email, String username, String password) {
        super(name, userId, email, username, password, "Vendor");
    }
}
