package observer;

public class User implements Observer{
    private String name;
    private String email;
    Observable observable;

    public User(String name, String email, Observable observable){
        this.name = name;
        this.email = email;
        this.observable = observable;
    }

    public void update(){
        System.out.println("The state of Mobile Stock has changed. It is now " + observable.getData());
        System.out.println("User name is : " + name + " and email id is " + email);
    }
}
