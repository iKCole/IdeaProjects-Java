package Models;

public final class Account {
    private int id;
    private final String email;
    private final String password;

    Account(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getEmail() { return email; }

    public String getPassword() { return password; }

}
