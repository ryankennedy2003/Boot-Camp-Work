package mobile_banking.models;

import java.util.ArrayList;

public class User {
    private String name;
    private int uID;
    private String username;
    private String password;
    private ArrayList<Account> accounts;

    public User(String name, int uID, String username, String password, ArrayList<Account> accounts) {
        this.name = name;
        this.uID = uID;
        this.username = username;
        this.password = password;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addAccounts(Account account) {
        accounts.add(account);
    }
}
