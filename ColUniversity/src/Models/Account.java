package Models;

public final class Account {
    private int id;
    private final String email;
    private final String password;
    private final String userType;

    Account(int id, String email, String password, String userType) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public String getEmail() { return email; }

    public String getPassword() { return password; }

}
