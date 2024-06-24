package wallet;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String id;
    private String email;
    private String password;
    private List<Account>accounts;

    public User(String name, String id, String email, String password){
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.accounts = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public String getEmail(){
        return email;
    }

    public String passowrd(){
        return password;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }
}
